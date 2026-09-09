# Extension Validation Report

- Extension: tachiyomi-es.capibaratraductor-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 34
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3335229490349802396
- Source name: CapibaraTraductor
- Source language: es
- Selected manga input: popular offset 0: Blue Lock (`.../senshimanga`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 77 | Blue Lock (`.../senshimanga`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 36 | S-Rank Boukensha de Aru Ore no Musume-tachi wa Juudo no Father-con deshita (`.../rakuen`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 36 | Sangeki (`.../scanshub`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 36 | Lilim Holic (`.../scanshub`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | Blue Lock (`.../senshimanga`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Blue Lock (`.../senshimanga`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 365 | Capítulo 1 - Capítulo 1 (`.../senshimanga`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 78 |  |  | 1-10s |

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
| popular listing | PASS | 77 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Blue Lock, URL=`blue-lock/senshimanga` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Yowayowa-sensei, URL=`yowayowa-sensei/6ianfranc9` at page 1 offset 61 and page 2 offset 32 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 187/187 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 187/187 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://r2.capibaratraductor.com/.../1782924210201_506602.png` -> 2 manga URLs (examples: `haimiya-senpai-wa-kowakute-kawaii/saitoutranslations`, `haimiya-senpai-wa-kowakute-kawaii/fafa`) |  |  |  |
| thumbnail | PASS | `https://r2.capibaratraductor.com/.../1785883886443_434176.jpg` (image/jpeg, 453419 bytes, 832x1248) |  |  |  |
| details identity | PASS | Details preserved selected URL `blue-lock/senshimanga` |  |  |  |
| details thumbnail URL | PASS | `https://r2.capibaratraductor.com/.../1785883886443_434176.jpg` |  |  |  |
| details author | PASS | Kaneshiro Muneyuki |  |  |  |
| details artist | PASS | SenshiManga |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Yoichi Isagi perdió la oportunidad de ir a los campeonatos nacionales de secundaria porque pasó a su compañero de equipo que falló en lugar de dispararse a sí mismo. Isagi es uno de los 300 delanteros sub-18 elegidos por Jinpachi Ego, un hombre que fue contratado por la Asociación Japonesa de Fútbol después de la Copa Mundial de la FIFA 2018, para guiar a Japón a ganar la Copa del Mundo destruyendo el fútbol japonés. El plan de Ego es aislar a los 300 delanteros en una institución similar a una prisión llamada "Blue Lock", con el fin de crear el mayor "egoísta" / delantero del mundo, lo que ha faltado en el fútbol japonés. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 10 name, chapter 61 name, chapter 105 name, chapter 108 name, chapter 109 name, chapter 110 name |  |  |  |
| chapters | PASS | 365 chapters |  |  |  |
| chapter dates | PASS | 365 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 78 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://r2.capibaratraductor.com/.../1767580211216_36556.jpg` (image/jpeg, 2505272 bytes, 1244x1920) |  |  |  |
