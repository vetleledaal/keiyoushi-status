# Extension Validation Report

- Extension: tachiyomi-pt.imperiodabritannia-v1.4.56
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 31
- Lint: 1
- Warnings: 2
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7355004027880350247
- Source name: Sagrado Império da Britannia
- Source language: pt-BR
- Selected manga input: latest offset 0: O Soldado Esqueleto Não Pôde Proteger a Masmorra (`.../1458`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Imperador Demoníaco (`.../1404`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | O Soldado Esqueleto Não Pôde Proteger a Masmorra (`.../1458`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | É Ruim que o Protagonista Fique Imerso Demais no Personagem? (`.../2596`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | O Soldado Esqueleto Não Pôde Proteger a Masmorra (`.../1458 <redacted query values: slug>`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | O Soldado Esqueleto Não Pôde Proteger a Masmorra (`.../1458 <redacted query values: slug>`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 386 | Capitulo 1 (`.../1 <redacted query values: slug>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 22 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 0: title=O Soldado Esqueleto Não Pôde Proteger a Masmorra, URL=`.../1458 <redacted query values: slug>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 59/59 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 59/59 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://cdn.imperiodabritannia.net/.../cover.webp` -> 2 manga URLs (examples: `.../1458`, `.../1458 <redacted query values: slug>`) |  |  |  |
| thumbnail | PASS | `https://cdn.imperiodabritannia.net/.../cover.webp` (image/webp (encoding: lossy), 60850 bytes, 600x900) |  |  |  |
| details identity | UNUSUAL | Details changed selected URL `.../1458` to `.../1458 <redacted query values: slug>` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.imperiodabritannia.net/.../cover.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ação, Aventura, Fantasia, Medíocre scan, Reencarnação, Seinen, Sistema, Sobrenatural, Verdinha |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Seu único propósito era proteger sua mestra. Mesmo assim ele foi incapaz. Mas o destino tinha mais reservado a ele já que conseguiu uma nova chance para proteger sua mestra e mudar seu destino. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 386 chapters |  |  |  |
| chapter dates | PASS | 386 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.imperiodabritannia.net/.../pagina_001.webp` (image/webp (encoding: lossy), 439406 bytes, 720x1087) |  |  |  |
