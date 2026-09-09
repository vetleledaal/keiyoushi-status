# Extension Validation Report

- Extension: tachiyomi-all.miauscan-v1.4.39
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source theme: mangathemesia
- Source ID: 2886862669347225416
- Source name: Miau Scan
- Source language: es
- Selected manga input: popular offset 0: Negocio Matrimonial (`.../condicion-matrimoni4l`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Negocio Matrimonial (`.../condicion-matrimoni4l`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Terminé con mi esposo, ahora iré a hacer dinero (`.../termine-con-mi-esposo-ahora-ire-a-hacer-dinero`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Guarda tu espada al entrar al dormitorio (`.../guarda-tu-espada-al-entrar-al-dormitorio`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Jugador Todoterreno (`.../jugador-todoterreno`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 3 | Negocio Matrimonial (`.../condicion-matrimoni4l`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Negocio Matrimonial (`.../condicion-matrimoni4l`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 148 | Capítulo 1 (`.../condicion-matrimoni4l-01`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 140 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Negocio Matrimonial, URL=`.../condicion-matrimoni4l` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 83/83 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 83/83 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://leemiau.com/.../negocio50_2-210x300.jpg` (image/jpeg, 23585 bytes, 210x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../condicion-matrimoni4l` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://leemiau.com/.../negocio50_2-716x1024.jpg` (image/jpeg, 188481 bytes, 716x1024) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Bianca de Blanchefort. Una mujer que era la esposa de Zachary de Arno, pero que fue expulsada de la familia Arno después de su muerte por motivos de lujo, inmoralidad y lascivia. Una mujer que estuvo a punto de ser expulsada a un monasterio en la destartalada frontera tras vagar sin rumbo debido a la caída de su familia paterna, la familia Blanchefort. Y al final, una mujer que finalmente murió en el frío suelo de piedra. Una mujer sin honor. Esa era la vida antes del regreso de Bianca. *** “¿Es esto real? ¿De verdad he vuelto al pasado? "No es un sueño ni una alucinación. Esta hambre, cansancio, viveza… Todo es real." "Dios me ha dado otra valiosa oportunidad...!" El matrimonio es un negocio después de todo. Tener un hijo de Zachary será una buena fuente de negocios. Mantendré mi dote. El maldito vizconde no se llevará el territorio de Blanchefort y el territorio de Arno. "Debo tener un hijo con mi esposo, Zachary." "¿No debería valer la pena?" O seducirlo o persuadirlo... Esa es la cuestión. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 148 chapters |  |  |  |
| chapter dates | PASS | 148 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 140 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://leemiau.com/.../CT_E1-1.jpg` (image/jpeg, 807025 bytes, 720x972) |  |  |  |
