# Extension Validation Report

- Extension: tachiyomi-es.leermangaesp-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8196066207928937350
- Source name: LeerMangaEsp
- Source language: es
- Selected manga input: popular offset 0: Erio and Electric Doll (`.../erio-and-electric-doll`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 3 | Erio and Electric Doll (`.../erio-and-electric-doll`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 140 | Erio and Electric Doll (`.../erio-and-electric-doll`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Erio and Electric Doll (`.../erio-and-electric-doll`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Erio and Electric Doll (`.../erio-and-electric-doll`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 47 | Capítulo 1.00 (`.../1.00`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 27 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 3 entries |  |  |  |
| latest listing | PASS | 140 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Erio and Electric Doll, URL=`erio-and-electric-doll` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 144/144 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 144/144 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.mangalect.org/.../erio-and-electric-doll.webp` (image/webp (encoding: lossy), 71540 bytes, 300x450; server Content-Type: binary/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `erio-and-electric-doll` |  |  |  |
| details thumbnail URL | PASS | `https://images.mangalect.org/.../erio-and-electric-doll.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Aventura, Girls Love, Fantasía, Ciberpunk, Fantasia |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | La historia se centra en Anju, una muñeca eléctrica, y Erio, un humano criado por ella. Para que Erio experimente el mundo exterior, las dos emprendieron un viaje. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 47 chapters |  |  |  |
| chapter dates | PASS | 47 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 27 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://images.mangalect.org/.../pagina_001.webp` (image/webp (encoding: lossy), 264132 bytes, 1790x800) |  |  |  |
