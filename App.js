'use strict';

import React from 'react';
import { AppRegistry } from 'react-native';
import {createStore} from 'redux';
import {Provider} from 'react-redux';
import {createStackNavigator} from 'react-navigation';
import rootReducer from './src/main/js/reducers';
import WelcomePage from './src/main/js/components/pages/welcomePage/WelcomePage';
import LoginPage from './src/main/js/components/pages/loginPage/LoginPage';
import DonatrixPage from './src/main/js/components/pages/donatrixPage/DonatrixPage';

const store = createStore(rootReducer);

const RootStack = createStackNavigator(
    {
        Welcome: WelcomePage,
        Login: LoginPage,
        Donatrix: DonatrixPage
    },
    {
        initialRouteName: 'Welcome',
        headerMode: 'none'
    }
);

const App = (page) => (
    <Provider store = {store}>
        <RootStack />
    </Provider>
);

AppRegistry.registerComponent('main', () => App);

export default App;
