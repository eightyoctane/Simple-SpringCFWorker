Simple-SpringCFWorker
=====================

This package uses the Spring Template Utility Classes in conjunction with the maven appassembler 
plugin to invoke a unix shell "ps -ef" command

I started in STS with a Spring Template Project, and then selected "Simple Spring Utility Project" 
which is just a simple jar project that has some Spring configuration and an integration test (ie. you get
a prepopulated xml file which is your foundation).

Remember, this is not an MVC project, so you have absolutely no Web interface to the app through a browser.

So how is this going to run in cloudfoundry, which requires that an app runs within a Tomcat container?

This is my next point. This will be a maven project making use of the maven appassembler configured 
in the pom.xml file. The appassembler replaces the need for Tomcat. 

With no web interface, we have a true background worker, but no way to review it's status except via the
cloudfoundry log files (in this case we print the output of the unix shell command "ps -ef" to the stdout log.

There is nothing to keep this app running once it invokes the unix command a single time, so expect that when
you deploy to cloudfoundry.

Additional references can be found at:

http://blog.cloudfoundry.com/2012/05/09/running-workers-on-cloud-foundry-with-spring/

http://mojo.codehaus.org/appassembler/appassembler-maven-plugin/
