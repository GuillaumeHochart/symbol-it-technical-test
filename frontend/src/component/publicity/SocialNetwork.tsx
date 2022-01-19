import React from "react";
import classNames from "classnames";
import '../../App.css'

export function SocialNetwork(){
    return <div className={classNames('flex-column','flex','symbol-dispose')}>
        <a
            className="App-link"
            href="https://www.linkedin.com/in/guillaume-hochart-b363a5124/"
            target="_blank"
            rel="noopener noreferrer"
            style={{fontSize:"20px"}}
        >
            linkedin.com/in/guillaume-hochart
        </a>
        <a
            className="App-link"
            href="https://github.com/GuillaumeHochart"
            target="_blank"
            rel="noopener noreferrer"
            style={{fontSize:"20px"}}
        >
            github.com/GuillaumeHochart
        </a>
    </div>
}