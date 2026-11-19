# Extension Validation Report

- Extension: tachiyomi-en.characterdesignreferences-v1.6.0
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2016619251694025505
- Source name: Character Design References
- Source language: en
- Selected manga input: popular offset 0: Art of Berserk (`.../art-of-berserk`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Art of Berserk (`.../art-of-berserk`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | Art of Kiki's Delivery Service (`.../kikis-delivery-service`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Art of Berserk (`.../art-of-berserk`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Art of Berserk (`.../art-of-berserk`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../art-of-berserk`) |  | <1s |
| pages | `getPageList(chapter)` | success | 379 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Art of Berserk, URL=`.../art-of-berserk` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://images.squarespace-cdn.com/.../berserk.jpg <redacted query values: format>` (image/webp (container: extended), 100290 bytes, 750x545) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../art-of-berserk` |  |  |  |
| details thumbnail URL | PASS | `https://images.squarespace-cdn.com/.../berserk.jpg <redacted query values: format>` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Art of Animation |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 379 images<br><br>Berserk is an animation franchise produced by OLM, GEMBA, Millepensee and Liden Films. The first season of the series was directed by Naohito Takahashi in 1997, Shin Itagaki and Toshiyuki Kubooka took on the direction for the following adaptations. The franchise is based on the homonym manga series written and illustrated by Kentaro Miura. The pictures on this page are a collection of artworks from the manga, the animated series, and movies.<br><br>**THE STORY**<br><br>Guts is a wandering mercenary whose entire world from birth is warfare and bloodshed. Born from a hanged corpse, the adoptive mother who rescued him dies from the plague when Guts is only two years old, and from then on Guts learns to fight in the mercenary band led by his adoptive father Gambino. Gambino is cruel to Guts even as he teaches the boy warfare, selling access to Guts to a rapist among the mercenaries and later attempting to murder Guts in a drunken rage. Guts flees after killing his adoptive father in self-defense. As a young man, Guts fights without any regard for his safety and earns a fearsome reputation. He catches the attention of Griffith, the charismatic leader of the "Band of the Hawk". Griffith swiftly defeats Guts, forcing him to join the Band of the Hawk, and Guts soon becomes the band's renowned raid leader and Griffith's deadliest subordinate… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 379 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://images.squarespace-cdn.com/.../image-asset.jpeg` (image/webp (container: extended), 203198 bytes, 1071x778) |  |  |  |
