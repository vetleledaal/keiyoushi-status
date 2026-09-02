# Extension Validation Report

- Extension: tachiyomi-es.novamanhwa-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2716608619626653265
- Source name: Nova Manhwas
- Source language: es
- Selected manga input: popular offset 0: Yo, el Maestro Malvado, Llevo a mis Discípulas a ser Invencibles en Todo el Mundo (`.../yo-el-maestro-malvado-llevo-a-mis-discipulas-a-ser-invencibles-en-todo-el-mundo`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Yo, el Maestro Malvado, Llevo a mis Discípulas a ser Invencibles en Todo el Mundo (`.../yo-el-maestro-malvado-llevo-a-mis-discipulas-a-ser-invencibles-en-todo-el-mundo`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | El Niño Sepulturero Demoniaco (`.../el-nino-sepulturero-demoniaco`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | La Verdad de la Reencarnación de Otros Mundos (`.../la-verdad-de-la-reencarnacion-de-otros-mundos`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | El Niño Sepulturero Demoniaco (`.../el-nino-sepulturero-demoniaco`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Yo, el Maestro Malvado, Llevo a mis Discípulas a ser Invencibles en Todo el Mundo (`.../yo-el-maestro-malvado-llevo-a-mis-discipulas-a-ser-invencibles-en-todo-el-mundo`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Yo, el Maestro Malvado, Llevo a mis Discípulas a ser Invencibles en Todo el Mundo (`.../yo-el-maestro-malvado-llevo-a-mis-discipulas-a-ser-invencibles-en-todo-el-mundo`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 176 | Capítulo 1 (`.../yo-el-maestro-malvado-llevo-a-mis-discipulas-a-ser-invencibles-en-todo-el-mundo-capitulo-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 9 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Yo, el Maestro Malvado, Llevo a mis Discípulas a ser Invencibles en Todo el Mundo, URL=`.../yo-el-maestro-malvado-llevo-a-mis-discipulas-a-ser-invencibles-en-todo-el-mundo` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://novamanhwa.cc/.../<redacted email address>` (image/avif (format: avif), 23894 bytes, 310x413; server Content-Type: text/plain) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../yo-el-maestro-malvado-llevo-a-mis-discipulas-a-ser-invencibles-en-todo-el-mundo` |  |  |  |
| details thumbnail URL | PASS | `https://novamanhwa.cc/.../<redacted email address>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Accion, Artes marciales, Aventura, Fantasia, Harem, Reencarnacion |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Shen Shi se sintió muy triste. No entendía por qué había viajado al libro que había escrito y todavía no era el protagonista. Tampoco entendía que Long Ao Tian protagonista masculino, ¿por qué se había convertido en una mujer? Aún más no entendía que era claramente el discípulo que iba a ser criado, ¿por qué todos y cada uno de ellos querían llegar a la cima y convertirse en la esposa del maestro? Protagonista: “¡Maestro! ¿Vas a comerme primero hoy, o vas a comerme después de que acabe con todas las hermanas mayores? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 176 chapters |  |  |  |
| chapter dates | PASS | 176 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://i2.wp.com/.../01.webp` (image/jpeg, 1349364 bytes, 850x9990) |  |  |  |
