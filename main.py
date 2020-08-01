#!/usr/bin/python

import os
import subprocess
import time

p = subprocess.Popen(["java", "MyClass"], stdin=subprocess.PIPE, universal_newlines=True)
pid = os.getpid()
p.stdin.write("{}\r\n".format(pid))
p.stdin.write("First line {}\r\n".format(pid))
time.sleep(10)
p.stdin.write("Second line {}\r\n".format(pid))
p.stdin.write("x\r\n") # this line will not be printed into the file