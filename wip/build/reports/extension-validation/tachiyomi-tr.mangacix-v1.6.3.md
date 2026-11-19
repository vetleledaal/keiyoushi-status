# Extension Validation Report

- Extension: tachiyomi-tr.mangacix-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3129679266035695979
- Source name: MangaciX
- Source language: tr
- Selected manga input: popular offset 0: Osananajimi wo Mirume ga Kawatte Shimatta (`.../13519`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 16 | Osananajimi wo Mirume ga Kawatte Shimatta (`.../13519`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 16 | Dükün En Büyük Oğlu Olarak Reenkarne Oldum (`.../13531`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 10 | Tonari no Heya no Dwarf-san (`.../13598`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 6 | Sonum İmparatorla Gelecek (`.../13542`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Osananajimi wo Mirume ga Kawatte Shimatta (`.../13519`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Osananajimi wo Mirume ga Kawatte Shimatta (`.../13519`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3 | 1. Bölüm (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 37 |  |  | 1-10s |

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
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Osananajimi wo Mirume ga Kawatte Shimatta, URL=`13519` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.mangacix.net/.../1787221440626-4cac5389-bfdf-42f6-8d25-e91e0a2fb31b.jpg` (image/jpeg, 34911 bytes, 225x317) |  |  |  |
| details identity | PASS | Details preserved selected URL `13519` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.mangacix.net/.../1787221440626-4cac5389-bfdf-42f6-8d25-e91e0a2fb31b.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Yakın zamana kadar sadece çocukluk arkadaşı olmaları gerekiyordu… ama birbirlerini tanımaya başlayınca artık geri dönüş yok. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 37 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.mangacix.net/.../1787221655136-5f4ab52c-1bce-4f04-befc-479bd67b13ea.png` (image/png, 879202 bytes, 1080x607) |  |  |  |
