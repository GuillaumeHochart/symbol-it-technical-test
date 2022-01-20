import React from "react";
import classNames from "classnames";
import '../../App.css'

export function SocialNetwork(){
    return <div className={classNames('flex-column','flex','symbol-dispose','align-items-start')}>
        <div>
            <i className="fa fa-linkedin" style={{marginRight:'5px'}}/>
            <a
                className="App-link"
                href="https://www.linkedin.com/in/guillaume-hochart-b363a5124/"
                target="_blank"
                rel="noopener noreferrer"
                style={{fontSize:"20px"}}
            >
                linkedin.com/in/guillaume-hochart
            </a>
        </div>
        <div>
            <i className="fa fa-github" style={{marginRight:'5px'}}/>
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
        <div>
            <i className="fa fa-envelope" style={{marginRight:'5px'}}/>
            <a style={{fontSize:"20px"}} className="App-link" href="mailto:guillaume.hochart.pro@gmail.com?Subject=Test technique symbol-it&amp;body=">guillaume.hochart.pro@gmail.com</a>
        </div>

    </div>
}