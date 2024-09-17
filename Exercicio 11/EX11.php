<?php

// 1. Command Interface
interface Command {
    public function execute();
}

// 2. Receiver
class Light {
    public function turnOn() {
        echo "Light is ON\n";
    }

    public function turnOff() {
        echo "Light is OFF\n";
    }
}

// 3. Concrete Commands
class TurnOnCommand implements Command {
    private $light;

    public function __construct(Light $light) {
        $this->light = $light;
    }

    public function execute() {
        $this->light->turnOn();
    }
}

class TurnOffCommand implements Command {
    private $light;

    public function __construct(Light $light) {
        $this->light = $light;
    }

    public function execute() {
        $this->light->turnOff();
    }
}

// 4. Invoker
class RemoteControl {
    private $commands = [];

    public function setCommand(Command $command) {
        $this->commands[] = $command;
    }

    public function pressButton() {
        foreach ($this->commands as $command) {
            $command->execute();
        }
    }
}

// 5. Interpreter Pattern
// Abstract Expression
interface Expression {
    public function interpret($context);
}

// Terminal Expression
class NumberExpression implements Expression {
    private $number;

    public function __construct($number) {
        $this->number = $number;
    }

    public function interpret($context) {
        return $this->number;
    }
}

// Nonterminal Expression
class AddExpression implements Expression {
    private $leftExpression;
    private $rightExpression;

    public function __construct(Expression $leftExpression, Expression $rightExpression) {
        $this->leftExpression = $leftExpression;
        $this->rightExpression = $rightExpression;
    }

    public function interpret($context) {
        return $this->leftExpression->interpret($context) + $this->rightExpression->interpret($context);
    }
}

// Client Code for Command Pattern
$light = new Light();

$turnOn = new TurnOnCommand($light);
$turnOff = new TurnOffCommand($light);

$remoteControl = new RemoteControl();
$remoteControl->setCommand($turnOn);
$remoteControl->setCommand($turnOff);

$remoteControl->pressButton();

// Client Code for Interpreter Pattern
$context = null;

// Interpret the expression (5 + 3)
$expression = new AddExpression(new NumberExpression(5), new NumberExpression(3));
$result = $expression->interpret($context);

echo "Result: " . $result;  // Output: Result: 8
