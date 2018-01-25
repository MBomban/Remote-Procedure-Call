# Remote-Procedure-Call
Running sample implementation of simple RMI-RPC (Remote Method Invocation-Remote Procedure Call) program tounderstand how Compute RPC works in a client-server and proxy environment. Modifying the Compute sample programs to implement MatrixOps RPC in the same working environment.

The classes are divided to two categories, client side and server side. The main objective is to demonstrate a client side program can connect to the server side program, which allows access to other classes and methods and return a result. 
The classes processes matrices, convert to stringbuffer, sends to a class on the server side, calls to a class which looks for a specified class and method, computes, and returns the result. 

SimpleRMIExample -> CGIInvoke -> RPCUtil -> <specified class> 

SimpleRMIExample class with main() found in the client side which calls on server side class. (CGIInvoke) 

CGIInvoke is server side of RMI protocol. It has a the main() on the server side.

RPCUtil server side class which contains the findAndLoadClass method that searches jar files in the current directory for a resource that corresponds to the interface implemented by a class in this jar. 
