Step 1:Feature created

Feature: Login feature
@wip
  Scenario: Write smth to console
    Given The user opens Spartans Webpage


Step 2 :Stepdefinition created

     @Given("The user opens Spartans Webpage")
        public void the_user_opens_spartans_webpage() {
           String url= ConfigurationReader.get("url");
            Driver.get().get(url);
        }

Step3:Under stepDefs package, Hook class created

  @Before
    public void setUp(){
        System.out.println("\tthis is coming from BEFORE");
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }

        Driver.closeDriver();

    }

    !!!!!!*****************************
    When we want to use Page object Model we have to create a constructor for page and use

    Ex.
     public SpartansHomePage(){
        ---------------------->    PageFactory.initElements(Driver.get(),this);

        }
