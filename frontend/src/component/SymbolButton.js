import styled from "styled-components";
import {backGroundColor} from "../css/color";

export const SymbolButton = styled.button`
color: #fff;
    background-color: #006eb3;
    border-color: #006eb3;
    font-size: 1rem;
    line-height: 1.5;
    color: #fff;
    cursor: pointer;
    font-weight: 400;
    width:50%;
    border: 1px solid transparent;
    border-radius: 50rem !important;
    transition: color 0.15s ease-in-out,background-color 0.15s ease-in-out,border-color 0.15s ease-in-out,box-shadow 0.15s ease-in-out;
  &:hover,focus {
    color: #fff;
    background-color: #00568d;
    border-color: #004f80;
  }
`