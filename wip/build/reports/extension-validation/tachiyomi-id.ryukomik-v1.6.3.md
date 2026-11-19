# Extension Validation Report

- Extension: tachiyomi-id.ryukomik-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 0
- Warnings: 2
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8514921831398456146
- Source name: Ryukomik
- Source language: id
- Selected manga input: popular offset 0: A Revenge Guide for the Terminally (`.../a-revenge-guide-for-the-terminally`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | A Revenge Guide for the Terminally (`.../a-revenge-guide-for-the-terminally`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 50 | 18-Year-Old Demon King (`.../18-year-old-demon-king`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 63 | The Obsessive Maniac Is Trying to Confine Me (`.../the-obsessive-maniac-is-trying-to-confine-me`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | A Revenge Guide for the Terminally (`.../a-revenge-guide-for-the-terminally`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Komik A Revenge Guide for the Terminally (`.../a-revenge-guide-for-the-terminally`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 6 | Chapter 1 (`.../a-revenge-guide-for-the-terminally-chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 56 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 63 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Revenge Guide for the Terminally, URL=`.../a-revenge-guide-for-the-terminally` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 166/166 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 166/166 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://thumbnail.komiku.org/.../img_68958eb08bd664.81717823.jpg <redacted query values: resize>` (image/jpeg, 15907 bytes, 160x220) |  |  |  |
| details identity | UNUSUAL | Details changed selected title A Revenge Guide for the Terminally to Komik A Revenge Guide for the Terminally |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://thumbnail.komiku.org/.../img_68958eb08bd664.81717823.jpg <redacted query values: w>` (image/jpeg, 104942 bytes, 499x724) |  |  |  |
| details author | PASS | Jem Yoshioka |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Drama, Fantasy, Reincarnation, Romance, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Cerita ini mengikuti perjalanan seorang individu yang merasa dikhianati dan mengalami penderitaan mendalam, sehingga memutuskan untuk merancang serangkaian balas dendam yang cermat. Dengan tujuan merebut kembali kendali atas hidupnya, ia menghadapi berbagai tantangan dan konflik yang menguji ketahanan mental dan emosionalnya. Dalam prosesnya, protagonis bertemu dengan berbagai karakter yang menunjang atau menghambat rencana balas dendamnya. Cerita mengungkap bagaimana dendam tidak hanya membawa perubahan pada lingkungan sekitar tapi juga menimbulkan refleksi tentang keadilan dan arti sebenarnya dari pembalasan. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | PASS | 6 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 56 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://api.ryukomik.com/.../image <redacted query values: url>` (image/jpeg, 145552 bytes, 640x418) |  |  |  |
