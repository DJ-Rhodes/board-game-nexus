import React, {useState, useEffect} from 'react'
import {Link} from "react-router-dom";
import {FontAwesomeIcon} from "@fortawesome/react-fontawesome";
import { faTimes, faBars, faDiceD20 } from '@fortawesome/free-solid-svg-icons';
import {Button} from "./Button";
import './Navbar.css'

function Navbar() {
    const [click, setClick] = useState(false);
    const [button, setButton] = useState(true);

    const handleClick = () => setClick(!click);
    const closeMobileMenu = () => setClick(false);

    const showButton = () => {
        if(window.innerWidth <= 960) {
            setButton(false);
        } else {
            setButton(true);
        }
    };

    useEffect(() => {
        showButton();
    }, []);

    window.addEventListener('resize', showButton);

    return (
        <>
            <nav className='navbar'>
                <div className='navbar-container'>
                    <Link to='/' className='navbar-logo'  onClick={closeMobileMenu}>
                        TBGN <FontAwesomeIcon icon={faDiceD20} className='navbar-logo-icon'/>
                    </Link>
                    <div className='menu-icon' onClick={handleClick}>
                        <FontAwesomeIcon
                            icon={click ? faTimes : faBars}
                            className={click ? 'menu-icon-open' : 'menu-icon-close'}></FontAwesomeIcon>
                    </div>
                    <ul className={click ? 'nav-menu active' : 'nav-menu'}>
                        <li className='nav-item'>
                            <Link to='/' className='nav-links' onClick={closeMobileMenu}>
                                Home
                            </Link>
                        </li>
                        <li className='nav-item'>
                            <Link to='/games' className='nav-links' onClick={closeMobileMenu}>
                                Games
                            </Link>
                        </li>
                        <li className='nav-item'>
                            <Link to='/popular' className='nav-links' onClick={closeMobileMenu}>
                                Popular
                            </Link>
                        </li>
                        <li className='nav-item'>
                            <Link to='/sign-up' className='nav-links-mobile' onClick={closeMobileMenu}>
                                Sign Up
                            </Link>
                        </li>
                    </ul>
                    {button && <Button buttonStyle='btn--outline'>SIGN UP</Button>}
                </div>
            </nav>
        </>
    )
}

export default Navbar
