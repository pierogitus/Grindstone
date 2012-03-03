# Grindstone

Java to C# converter plugin for eclipse - fork of Sharpen

### Goal

Create a robust and configurable Java to C# converter. Using [Apache Lucene](http://lucene.apache.org/core) as test bed to make improvements and evaluate usage as porting tool for [Lucene.Net](http://incubator.apache.org/lucene.net)

### How to Setup

1. Install Eclipse IDE - you will need a Java EE edition to build plugins
2. File -> Export -> Plug-in Development -> Deployable plug-ins and fragments
3. Deploy into path where Eclipse is installed (so that the jar ends up in the /plugins folder under Eclispe)

### How to Use

I run it with [Ant](http://ant.apache.org/) so I can use command line options. I haven't tried the GUI part of this.

Sample Ant scripts are in /LuceneTest

GrindstoneHelperLib - C# library of helper modules needed for certain mappings in output (this is the old Sharpen namespace classes)

### How to run for Lucene

1. Download Lucene java 3.5 source (recommended way is use Subclipse from Eclipse IDE)
2. Setup .classpath and .project (samples are in /LuceneTest) and make sure project will build in Eclipse
3. Run Ant with scripts in /LuceneTest (modify build-properties.xml for your environment)

### Current Status

Grindstone successfully completes a conversion of Lucene 3.5 without crashing. Building output in Visual Studio 2010 yeilds 1261 errors.

### Next Steps

Continue to address C# build errors by fixing java eclipse plugin conversion process in most generic and flexible ways possible. 

### Origin

Fork of db4o Sharpen - https://source.db4o.com/db4o/trunk/sharpen/