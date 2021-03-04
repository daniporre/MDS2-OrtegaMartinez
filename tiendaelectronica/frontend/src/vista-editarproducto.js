import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-editarproducto`
 *
 * VistaEditarproducto element.
 *
 * @customElement
 * @polymer
 */
class VistaEditarproducto extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-editarproducto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEditarproducto.is, VistaEditarproducto);
