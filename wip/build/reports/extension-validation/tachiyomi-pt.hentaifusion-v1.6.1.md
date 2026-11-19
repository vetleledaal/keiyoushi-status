# Extension Validation Report

- Extension: tachiyomi-pt.hentaifusion-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 27
- Lint: 2
- Warnings: 3
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5510466202623942394
- Source name: Hentai Fusion
- Source language: pt
- Selected manga input: popular offset 0: A Babá Tammy (`https://hentaifusion.me/.../a-baba-tammy`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | A Babá Tammy (`https://hentaifusion.me/.../a-baba-tammy`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 12 | Aventuras Sexuais em Kivotos (`https://hentaifusion.me/.../aventuras-sexuais-em-kivotos`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | A Babá Tammy (`https://hentaifusion.me/.../a-baba-tammy`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A Babá Tammy (`https://hentaifusion.me/.../a-baba-tammy`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Oneshot (`https://hentaifusion.me/.../a-baba-tammy`) |  | <1s |
| pages | `getPageList(chapter)` | success | 29 |  |  | <1s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Babá Tammy, URL=`https://hentaifusion.me/.../a-baba-tammy` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | LINT | 25/25 listing manga have titles and URLs; popular: all absolute; popular_next: all absolute; search: all absolute; Absolute URL examples: popular entry 1: `https://hentaifusion.me/.../a-baba-tammy`, popular entry 2: `https://hentaifusion.me/.../netorase-com-a-recem-casada-koharu`, popular entry 3: `https://hentaifusion.me/.../a-garota-hetero-e-a-garota-futanari` |  |  |  |
| thumbnail URLs | PASS | 25/25 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaifusion.me/.../Sitter_Tammy_pg00-241x334.webp` (image/webp (encoding: lossy), 19482 bytes, 241x334) |  |  |  |
| details identity | PASS | Details preserved selected URL `https://hentaifusion.me/.../a-baba-tammy` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hentaifusion.me/.../Sitter_Tammy_pg00.webp` (image/webp (encoding: lossy), 125008 bytes, 1258x1780) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Hentai Sem Censura, HQ de Sexo, Anal, Boquete, Brinquedos Sexuais, Filmagem, Masturbação, Voyeurismo |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | A Babá Tammy – HQ de Sexo. Tammy trabalha como babá na casa dos Andersons. Ela está com tesão no seu patrão já tem muito tempo. E quando o homem lhe dá uma carona para casa, a garota aproveita para seduzi-lo e fazer sexo com ele!<br><br>Categorias: Hentai Sem CensuraHQ de Sexo<br><br>Tags: AnalBoqueteBrinquedos SexuaisFilmagemMasturbaçãoVoyeurismo<br><br>Tipo: Sem Censura<br><br>Cor: Preto e Branco<br><br>Paródia: Original<br><br>Páginas 29 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 1 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 29 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://hentaifusion.me/.../2` to `https://hentaifusion.me/.../2` (1 redirects) |  |  |  |
| page load | PASS | `https://hentaifusion.me/.../Sitter_Tammy_pg00.webp` (image/webp (encoding: lossy), 125008 bytes, 1258x1780) |  |  |  |
