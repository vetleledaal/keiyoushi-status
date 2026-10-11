# Extension Validation Report

- Extension: tachiyomi-pt.pizzariascan-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangawork
- Source ID: 3359822911747375789
- Source name: PizzariaScan
- Source language: pt-BR
- Selected manga input: popular offset 0: Isekai Meikyuu de Harem o (`.../isekai-meikyuu-de-harem-o`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Isekai Meikyuu de Harem o (`.../isekai-meikyuu-de-harem-o`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 10 | Kujibiki Tokushou: Musou Harem-ken (`.../kujibiki-tokushou-musou-harem-ken`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 10 | Kinenbi Manga (`.../kinenbi-manga`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 10 | Servamp (`.../servamp`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Isekai Meikyuu de Harem o (`.../isekai-meikyuu-de-harem-o`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Isekai Meikyuu de Harem o (`.../isekai-meikyuu-de-harem-o`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 140 | Capítulo 0 (`.../isekai-meikyuu-de-harem-o-capitulo-0`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 13 |  |  | 1-10s |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Isekai Meikyuu de Harem o, URL=`.../isekai-meikyuu-de-harem-o` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images-ext-1.discordapp.net/.../950599ce-fe8c-4e60-b982-d7d2b864e50d.jpg <redacted query values: format, width, and height>` (image/webp (encoding: lossy), 70968 bytes, 548x780) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../isekai-meikyuu-de-harem-o` |  |  |  |
| details thumbnail URL | PASS | `https://images-ext-1.discordapp.net/.../950599ce-fe8c-4e60-b982-d7d2b864e50d.jpg <redacted query values: format, width, and height>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Um homem estava prestes a cometer suicídio e decide procurar uma maneira de morrer na internet, mas então encontrou um site estranho que fazia muitas perguntas e tinha um sistema baseado em pontos que permite criar habilidades e habilidades para um personagem . Ele se interessou e quando terminou de montar seu personagem lhe perguntaram: “Você agora será transportado para um mundo com os cenários que você escolher, voltar não é possível, você ainda aceita?” Sem pensar muito nisso ele apertou SIM e se viu em outro mundo com as habilidades e habilidades que escolheu ter. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 140 chapters |  |  |  |
| chapter dates | PASS | 140 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://pizzariacomics.com/.../2 <redacted query values: title, order, status, and type>` to `https://pizzariacomics.com/.../2 <redacted query values: title, order, status, and type>` (1 redirects); popular: `https://pizzariacomics.com/.../2 <redacted query values: title, order, status, and type>` to `https://pizzariacomics.com/.../2 <redacted query values: title, order, status, and type>` (1 redirects) |  |  |  |
| page load | PASS | `https://pizzariacomics.com/.../1-ee0d591f70cd2737e2ee2db24f574a19989f091a84108d1001728a9a38b549b9.jpg` (image/jpeg, 3609901 bytes, 1686x2528) |  |  |  |
