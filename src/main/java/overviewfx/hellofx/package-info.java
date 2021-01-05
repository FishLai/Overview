package overviewfx.hellofx;

/*
 * Record
 * 21.01.05
 * 21.01.04-05
 * Deploy Hello App
 *  ref: https://docs.oracle.com/javase/8/docs/technotes/guides/deploy/deploy_quick_start.html#BABJCFHC
 *  Content:
 *    There are four ways to run our javafx app
 *      1. JAR file
 *        p.s. need to be signed with a valid signing certificate if
 *        the APP is embedded in a web page or launched from a
 *        browser.
 *      2. A JNLP file
 *        p.s. an xml file describes APP component, platform
 *        requirements, and launch rules.
 *      3. An HTML file containing JavaScript code to embed or launch
 *      APP from the web page
 *      4. Self-contained APP, including all APP resources, the JRE,
 *      and a launcher. It can be distributed as zip file or 
 *      as installable package EXE or MSI for Windows...
 *      
 *    There are four package way
 *    1. NetBeans IDE - now use eclipse as IDE, so not choosing this 
 *    2. Ant Tasks
 *    3. Java Packager Command-Line Tool
 *    4. Maven build - already use it so try it first.
 *      ref: https://kentyeh.github.io/mavenStartup/#property
 *      use javafx-maven-plugin javafx:jlink
 *        Need module desciptor (module-info.java)
 *          junit has error hightlight...
 *          try to 
 *            add "buildpath -> library -> Junit"
 *            comment "requires junit" in module-info.java
 *          
 */