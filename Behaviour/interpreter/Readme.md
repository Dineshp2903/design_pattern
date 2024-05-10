****Interpreter Pattern****

**Context**: This represents the global state of the interpreter. It contains information that is global to the interpreter.

**Abstract Expression**: This is an abstract class or interface that declares an abstract interpret() method. It defines the interface for executing the operation.

**Terminal Expression**: These expressions represent the terminal symbols in the language grammar. They implement the interpret() method according to their purpose.

**Non-terminal Expression**: These expressions represent the non-terminal symbols in the language grammar. They typically consist of one or more sub-expressions. They also implement the interpret() method, often by calling interpret() on their sub-expressions.

**Client**: The client is responsible for building the abstract syntax tree using the terminal and non-terminal expressions, and then invoking the interpret() method on the root of the tree.
