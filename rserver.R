library(shiny)
libs=c("bnlearn")
type=getOption("pkgType")                           
    CheckInstallPackage <- function(packages, repos="http://cran.r-project.org",
       depend=c("Depends", "Imports", "LinkingTo", "Suggests", "Enhances"), ...) {
         installed=as.data.frame(installed.packages())
    for(p in packages) {
        if(is.na(charmatch(p, installed[,1]))) { 
          install.packages(p, repos=repos, dependencies=depend, ...) 
                    }
      }
    } 
    CheckInstallPackage(packages=libs)
library("bnlearn")
load(file = "model_bayesnet_7.rda")
options(scipen = 999) 

ui <- fluidPage(
  textInput("caption", "Caption", "cpquery(bayesNetModel, event = (country=='US' & state=='WY'), evidence = TRUE)"),
  verbatimTextOutput("value")
)

server <- function(input, output) {

values <- reactive({
	#print("processing new request ")
 	set.seed(1)
 	ip<-parse(text=input$caption)
	eval(ip)

  })
  
  output$value <- renderText(values())
}

options(shiny.port = 9999)
shinyApp(ui, server)