# Extension Validation Report

- Extension: tachiyomi-pt.mundohentai-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 29
- Lint: 1
- Warnings: 2
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 141171756957474060
- Source name: Mundo Hentai
- Source language: pt-BR
- Selected manga input: popular offset 0: [Doujinshi] Terapeuta Sexual Corporal 2 ~ Por Favor, Durma Com a Minha Esposa ~ (`.../terapeuta-sexual-corporal-2-por-favor-durma-com-a-minha-esposa`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 15 | [Doujinshi] Terapeuta Sexual Corporal 2 ~ Por Favor, Durma Com a Minha Esposa ~ (`.../terapeuta-sexual-corporal-2-por-favor-durma-com-a-minha-esposa`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 15 | [Doujinshi] Chamei Um Serviço de Acompanhante e a Irmã Mais Nova da Minha Namorada Apareceu ~ Edição Duas Irmãs (`.../chamei-um-servico-de-acompanhante-e-a-irma-mais-nova-da-minha-namorada-apareceu-edicao-duas-irmas`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 20 | [Mangá Hentai] A Brincadeira da Esposa é a Qualquer Momento... (`.../a-brincadeira-da-esposa-e-a-qualquer-momento`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [Doujinshi] Terapeuta Sexual Corporal 2 ~ Por Favor, Durma Com a Minha Esposa ~ (`.../terapeuta-sexual-corporal-2-por-favor-durma-com-a-minha-esposa`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo (`.../terapeuta-sexual-corporal-2-por-favor-durma-com-a-minha-esposa`) |  | <1s |
| pages | `getPageList(chapter)` | success | 60 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=\[Doujinshi\] Terapeuta Sexual Corporal 2 ~ Por Favor, Durma Com a Minha Esposa ~, URL=`.../terapeuta-sexual-corporal-2-por-favor-durma-com-a-minha-esposa` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 50/50 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 50/50 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mundohentaioficial.com/.../01-2-241x334.jpg` (image/jpeg, 19334 bytes, 241x334) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../terapeuta-sexual-corporal-2-por-favor-durma-com-a-minha-esposa` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mundohentaioficial.com/.../01-2.jpg` (image/jpeg, 249600 bytes, 1280x1807) |  |  |  |
| details author | PASS | Login Registre-se |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Boquete, Creampie, MILF, Netorare, Peitões, Pelos Pubianos, Raio-X |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Cor: Preto e Branco |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 60 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://mundohentaioficial.com/.../2` to `https://mundohentaioficial.com/.../2` (1 redirects) |  |  |  |
| page load | PASS | `https://mundohentaioficial.com/.../1-5.jpg` (image/jpeg, 336938 bytes, 1280x1807) |  |  |  |
