import { defineConfig } from 'vite'
import lessGlobImports from 'vite-plugin-less-glob-import';

export default defineConfig({
  plugins: [
    lessGlobImports()
  ]
});
