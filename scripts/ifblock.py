from org.mob.templ8 import *
from java.io import *
from java.util import LinkedHashMap
tl = TemplateLoader("/home/mike/templ823/testdata")
#t = tl.getTemplate("fortest.txt")
t = tl.getTemplate("ifblocks.txt")
sw = StringWriter()
ec = ExecutionContext(sw)
ec.setObject("x1", 1);
ec.setObject("x2", 4);
t.execute(ec)
print "\n\n" + sw.toString()

