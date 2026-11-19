# Extension Validation Report

- Extension: tachiyomi-pt.bryaoi-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 24
- Lint: 3
- Warnings: 1
- Skipped: 8
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3480299458405323329
- Source name: BR Yaoi
- Source language: pt-BR
- Selected manga input: popular offset 0: Desflore-me, se puder (Novel) (`.../desflore-me-se-puder-novel-online`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Desflore-me, se puder (Novel) (`.../desflore-me-se-puder-novel-online`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | Vilã de Chá Verde Fracassa (`.../vila-de-cha-verde-fracassa-online`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Desflore-me, se puder (Novel) (`.../desflore-me-se-puder-novel-online`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Desflore-me, se puder (Novel) (`.../desflore-me-se-puder-novel-online`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 85 | Capítulo 01 (`.../desflore-me-se-puder-novel-01-online`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | <1s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Desflore-me, se puder (Novel), URL=`.../desflore-me-se-puder-novel-online` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 37/37 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 37/37 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://nameclubpower.xyz/.../desflore-me-se-puder-novel.webp` (image/webp (encoding: lossy), 67754 bytes, 627x910) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../desflore-me-se-puder-novel-online` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://nameclubpower.xyz/.../desflore-me-se-puder-novel_178.webp` (image/webp (encoding: lossy), 15738 bytes, 227x330) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comédia, Drama, Mangás, Novel, Omegaverse, Romance, Yaois |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | <br>Sinopse: Bliss Miller, o filho mais novo da família Miller e um ômega dominante, apaixona-se à primeira vista por Cassian Strickland quando ainda era criança. Chega até a pedi-lo em casamento com a inocência da sua idade. Cassian, herdeiro da poderosa família Strickland, não leva a sério essa promessa e eles se separam após um ano. No entanto, Bliss nunca esquece o que aconteceu. Anos depois, ao ver por acaso o rosto de Cassian no noticiário, lembra-se de tudo o que aconteceu entre eles. A promessa, a traição e a humilhação que sofreu. Decidido a se vingar, Bliss toma uma decisão extrema: infiltrar-se na casa de Cassian como empregado para fazer com que aquele homem arrogante acabe de joelhos pedindo perdão. Mas o reencontro entre ambos não será tão simples como ele imaginava. Nome alternativo: Deflower Me If You Can<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 85 chapters |  |  |  |
| chapter dates | LINT | All 85 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=85 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
