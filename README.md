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

Sample Ant scripts for converting Lucene 3.5 are in /LuceneTest

### Origin

Fork of db4o Sharpen - https://source.db4o.com/db4o/trunk/sharpen/