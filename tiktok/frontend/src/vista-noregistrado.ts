import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-icons/vaadin-icons.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-icons/vaadin-icons.js'; import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js'; import '@vaadin/vaadin-avatar/src/vaadin-avatar.js'; import '@polymer/iron-icon/iron-icon.js'; import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js'; import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-noregistrado')
export class VistaNoregistrado extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
width: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color:white;" id="vaadinHorizontalLayout">
  <img style="flex-grow: 0; flex-shrink: 0; align-self: flex-start; height: 100%; width: 10%;" src="" id="img">
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; align-self: center;" id="vaadinVerticalLayout1">
   <vaadin-text-field placeholder="Buscar Cuentas" style="flex-grow: 0; align-self: center; width: 40%;" id="vaadinTextField">
    <iron-icon icon="lumo:search" slot="prefix" id="ironIcon"></iron-icon>
   </vaadin-text-field>
  </vaadin-vertical-layout>
  <vaadin-button style="align-self: center; width: 10%;" id="vaadinButton">
   <iron-icon icon="lumo:plus" slot="prefix" id="ironIcon1"></iron-icon>Cargar 
  </vaadin-button>
  <vaadin-button theme="primary error" style="align-self: center; color:white; width: 10%;" id="vaadinButton1">
    Iniciar Sesión 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; flex-grow: 1; flex-shrink: 1; flex-basis: auto;" id="vaadinHorizontalLayout1">
  <vaadin-vertical-layout class="sidebar" style="flex-grow: 0; flex-shrink: 1;" id="vaadinVerticalLayout2">
   <vaadin-button style="color:black; background:white; align-self: stretch;" id="vaadinButton">
    <iron-icon icon="vaadin:home-o" slot="prefix" id="ironIcon2" style="color:black;"></iron-icon>Para ti 
   </vaadin-button>
   <vaadin-button style="color:black; background:white; align-self: stretch;" id="vaadinButton2">
    <iron-icon icon="vaadin:users" slot="prefix" style="color:black;" id="icon"></iron-icon>Siguiendo 
   </vaadin-button>
   <label id="label" style="width: 50%; align-self: stretch;">Inicia sesión para seguir a creadores, dar un me gusta a videos y ver comentarios.</label>
   <vaadin-button id="vaadinButton3" style="background:white; color:red; border: 2px solid red; align-self: stretch;">
     Iniciar Sesión 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout class="content" style="flex-grow: 1; flex-shrink: 1; flex-basis: auto;" id="vaadinVerticalLayout3"></vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
