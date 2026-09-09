# Extension Validation Report

- Extension: tachiyomi-pt.argoscomics-v1.6.58
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 28
- Lint: 1
- Warnings: 1
- Skipped: 6
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2731562656488805764
- Source name: Argos Comics
- Source language: pt-BR
- Selected manga input: popular offset 0: Agricultura No Modo Hack Em Outro Mundo (`.../agricultura-no-modo-hack-em-outro-mundo`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Agricultura No Modo Hack Em Outro Mundo (`.../agricultura-no-modo-hack-em-outro-mundo`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 10 | A “Vida Pacífica” De Um Aventureiro Rank A (`.../a-vida-pacifica-de-um-aventureiro-rank-a`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | Batalha Através Dos Céus (`.../batalha-atraves-dos-ceus`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Agricultura No Modo Hack Em Outro Mundo (`.../agricultura-no-modo-hack-em-outro-mundo`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Agricultura No Modo Hack Em Outro Mundo (`.../agricultura-no-modo-hack-em-outro-mundo`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 24 | 1.0 (`.../1.0`) |  | 1-10s |
| pages | `getPageList(chapter)` | error | 0 |  | java.lang.NullPointerException | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | java.lang.NullPointerException | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Agricultura No Modo Hack Em Outro Mundo, URL=`.../agricultura-no-modo-hack-em-outro-mundo` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://supabase.aniargos.com/.../a97fc0b9-8fb0-44bf-8b6f-90769a3f6b76.webp` (image/webp (encoding: lossy), 131120 bytes, 640x800; server Content-Type: text/plain;charset=UTF-8) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../agricultura-no-modo-hack-em-outro-mundo` |  |  |  |
| details thumbnail URL | PASS | `https://supabase.aniargos.com/.../a97fc0b9-8fb0-44bf-8b6f-90769a3f6b76.webp` |  |  |  |
| details author | PASS | Shiraishi Arata |  |  |  |
| details artist | PASS | Ayatsuki Tsuna |  |  |  |
| details genres | PASS | Ação, Aventura, Fantasia, Isekai, Ecchi, Magia, Manga, Adulto, Fazendinha |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Tatsuya, um solteiro japonês de 29 anos, é acidentalmente convocado para outro mundo e recebe uma habilidade incomum: \[Habilidades Agrícolas\].<br>Sem talentos de combate, ele decide plantar e sobreviver cultivando sua própria horta em uma floresta isolada.<br><br>Apesar de pensar que sua vida seria difícil, Tatsuya logo descobre que os ingredientes do outro mundo são incrivelmente saborosos — e, combinados com temperos japoneses, ele cria pratos deliciosos que o deixam mais feliz a cada refeição.<br>Arroz, saquê e outras comidas reconfortantes se tornam parte da rotina!<br><br>E se noivas lindas aparecerem no processo...? Tudo bem também!<br>Assim começa a vida isekai relaxante de Tatsuya: cheia de comida, cultivo e um harém leve, onde a paz e os sabores importam mais do que batalhas.<br><br>Uma comédia romântica slice of life de outro mundo, perfeita para quem adora fantasia, comida boa e momentos reconfortantes.<br><br>Titulos alternativos: Yuru fuwa Nouka no Mojibake Skill ~Isekai de Catalog Tsuuhan Yattemasu~, ゆるふわ農家の文字化けスキル ～異世界でカタログ通販やってます～<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 24 chapters |  |  |  |
| chapter dates | PASS | 24 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | pages operation did not complete successfully |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://aniargos.com/.../1.0` to `https://aniargos.com/.../login <redacted query values: redirect>` (1 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
