import styled from "styled-components";
import back
  from "../images/background.jpg";

export const Background = styled.div`
      background-image: linear-gradient(0deg,rgba(161,187,214,0.9) 0%, rgba(42,59,78,0.8) 68%),url(${back});
      background-size: cover;
      background-repeat: no-repeat;
      box-shadow: rgb(0 0 0 / 40%) 0px 0px 16px 0px;
      color: white;
      width: 100%;
      display: flex;
      align-items: baseline;
      color: white;
      font-weight: bold; 
`