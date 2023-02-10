import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-icons/vaadin-icons.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-publicacion')
export class VistaPublicacion extends LitElement {
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
<vaadin-vertical-layout class="content" style="width: 100%; height: 100%; align-items: stretch;" id="vaadinVerticalLayoutM">
 <vaadin-horizontal-layout style="width: 100%; height: 100%; align-self: stretch;" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 100%; height: 100%; align-items: stretch;" id="vaadinVerticalLayout">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="align-self: stretch; width: 100%; margin: var(--lumo-space-m); padding: var(--lumo-space-m);">
    <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="flex-grow: 0;">
     <vaadin-avatar id="vaadinAvatar" style="align-self: stretch; flex-grow: 0;"></vaadin-avatar>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="flex-grow: 1; width: 100%;">
     <label style="align-self: stretch; width: 100%;" id="label3">Jesús Almendros </label>
     <label style="align-self: stretch; width: 100%;" id="label4">#viral #mds #tiktok #vaadin </label>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <div id="div" style="align-self: stretch; flex-grow: 1;"></div>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: stretch; flex-grow: 1;">
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; flex-shrink: 1; height: 100%; align-items: stretch; align-self: stretch;" id="vaadinVerticalLayout3"></vaadin-vertical-layout>
   <vaadin-button theme="icon" aria-label="Add new" style="align-self: center;" id="vaadinButton1">
    <iron-icon icon="vaadin:comment-ellipsis" id="ironIcon"></iron-icon>
   </vaadin-button>
   <label id="label1" style="align-self: center;">999</label>
   <vaadin-button theme="icon" aria-label="Add new" style="align-self: center;" id="vaadinButton2">
    <iron-icon icon="vaadin:arrow-forward" id="ironIcon1"></iron-icon>
   </vaadin-button>
   <label id="label2" style="align-self: center;">345 </label>
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton" style="align-self: center;">
    <iron-icon icon="vaadin:heart"></iron-icon>
   </vaadin-button>
   <label id="label" style="align-self: center; flex-grow: 0; flex-shrink: 0;">100.000 </label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
