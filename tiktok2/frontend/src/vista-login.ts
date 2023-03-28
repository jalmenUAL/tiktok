import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-form-layout/vaadin-form-layout.js';
import '@vaadin/vaadin-text-field/vaadin-text-field.js';
import '@vaadin/vaadin-form-layout/vaadin-form-item.js';
import '@vaadin/vaadin-button/vaadin-button.js';

@customElement('vista-login')
export class VistaLogin extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-form-layout id="vaadinFormLayout" style="width: 100%; height: 100%;">
 <vaadin-form-item id="vaadinFormItem">
  <label slot="label" id="label">Login</label>
  <vaadin-text-field class="full-width" value="Example text field" required id="vaadinTextField" has-value></vaadin-text-field>
 </vaadin-form-item>
 <vaadin-form-item id="vaadinFormItem1">
  <label slot="label" id="label1">Password</label>
  <vaadin-text-field class="full-width" value="Example text field" required has-value id="vaadinTextField1"></vaadin-text-field>
 </vaadin-form-item>
 <vaadin-button theme="primary" id="vaadinButton">
   OK 
 </vaadin-button>
 <vaadin-button theme="tertiary" id="vaadinButton1">
   Cancel 
 </vaadin-button>
</vaadin-form-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
