import logo from "../../images/logo-symbol-blanc.svg";
import React from "react";
import classNames from "classnames";

interface Props {
    value?: string;
}

export function Title({value}:Props){
    return <div className={classNames('flex','flex-column','justify-content-center','align-items-center','symbol-dispose')}>
        <img src={logo} className="App-logo" alt="logo" />
        <h2>
            {value != null?value :'Test technique 2 : Hochart Guillaume'}
        </h2>
    </div>
}