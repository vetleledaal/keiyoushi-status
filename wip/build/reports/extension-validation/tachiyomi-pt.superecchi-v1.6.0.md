# Extension Validation Report

- Extension: tachiyomi-pt.superecchi-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 0
- Warnings: 0
- Skipped: 6
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3268085364816772879
- Source name: Super Ecchi
- Source language: pt-BR
- Selected manga input: popular offset 0: Uwasa no Futanari Gal wa Hatsujou Shiteru (`.../livro.php <redacted query values: t>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | A garota futanari que está sendo alvo de rumores está no cio (`.../livro.php <redacted query values: t>`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 12 | Beleza Sensível 2 (`.../livro.php <redacted query values: t>`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | error | 0 |  | kotlinx.serialization.json.JsonDecodingException: Unexpected JSON token at offset 0: Expected start of the array '\[', but had 'n' instead at path: \$<br>JSON input: null<br> | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Uwasa no Futanari Gal wa Hatsujou Shiteru (`.../livro.php <redacted query values: t>`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo 1 (`.../leitor.php <redacted query values: t>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 20 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | ERROR | kotlinx.serialization.json.JsonDecodingException: Unexpected JSON token at offset 0: Expected start of the array '\[', but had 'n' instead at path: \$<br>JSON input: null<br> | REVIEW | INSUFFICIENT_EVIDENCE |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | SKIP | Unexpected JSON token at offset 0: Expected start of the array '\[', but had 'n' instead at path: \$<br>JSON input: null<br> |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 24/24 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 24/24 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://superecchi.com/.../a-garota-futanari-que-esta-sendo-alvo-de-rumores-esta-no-cio-1.webp` (image/webp (encoding: lossy), 8722 bytes, 155x220) |  |  |  |
| details identity | PASS | Details preserved selected URL `livro.php?t=Uwasa-no-Futanari-Gal-wa-Hatsujou-Shiteru-1` |  |  |  |
| details thumbnail URL | PASS | `https://superecchi.com/.../a-garota-futanari-que-esta-sendo-alvo-de-rumores-esta-no-cio-1.webp` |  |  |  |
| details author | PASS | asakura shimoichi |  |  |  |
| details artist | PASS | asakura shimoichi |  |  |  |
| details genres | PASS | big breasts, big penis, Blowjob F, Collar, Dark Skin, futanari, futanari on futanari, Gyaru, Schoolgirl Uniform F, smell |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | O cenário é um quarto de motel luxuoso, com a conta paga e a promessa de uma noite intensa. O parceiro, no entanto, não comparece, deixando uma mensagem clara: as duas convidadas devem aproveitar a suíte sozinhas. Diante do abandono inesperado, duas jovens futanaris decidem não desperdiçar a oportunidade. O que começa como uma conversa casual rapidamente evolui para uma exploração física profunda e sem tabus. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://superecchi.com/.../a-garota-futanari-que-esta-sendo-alvo-de-rumores-esta-no-cio-1.webp` (image/webp (encoding: lossy), 341270 bytes, 1280x1818) |  |  |  |
