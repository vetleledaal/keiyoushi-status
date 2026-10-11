# Extension Validation Report

- Extension: tachiyomi-id.narasininja-v1.6.3
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 0
- Warnings: 2
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4748581925941451102
- Source name: NarasiNinja
- Source language: id
- Selected manga input: popular offset 0: The Terminally Ill Baby Healer Doesn’t Hide Her Genius (`.../the-terminally-ill-baby-healer-doesnt-hide-her-genius`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | The Terminally Ill Baby Healer Doesn’t Hide Her Genius (`.../the-terminally-ill-baby-healer-doesnt-hide-her-genius`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | The Mad Dog Of The Duke's Estate (`.../the-mad-dog-of-the-dukes-estate`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Terminally Ill Baby Healer Doesn’t Hide Her Genius (`.../the-terminally-ill-baby-healer-doesnt-hide-her-genius`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Terminally Ill Baby Healer Doesn’t Hide Her Genius (`.../the-terminally-ill-baby-healer-doesnt-hide-her-genius`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 56 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 42 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Terminally Ill Baby Healer Doesn’t Hide Her Genius, URL=`.../the-terminally-ill-baby-healer-doesnt-hide-her-genius` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://narasininja.net/.../the-terminally-ill-baby-healer-doesnt-hide-her-genius.jpg` (image/jpeg, 40657 bytes, 271x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-terminally-ill-baby-healer-doesnt-hide-her-genius` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://narasininja.net/.../the-terminally-ill-baby-healer-doesnt-hide-her-genius.jpg` (image/jpeg, 40657 bytes, 271x400) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Fantasy, Historical, Romance, Shoujo |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Ini adalah kehidupan ketigaku. Di kehidupan sebelumnya, aku mencapai puncak sebagai tabib terbaik kekaisaran. Namun aku mati karena dikhianati, lalu terlahir kembali. Dan kembali mati. Aku lelah mengulang kegagalan yang sama. Masalahnya bukan pada kemampuanku, melainkan pada fakta bahwa aku selalu sendirian. Tidak ada satu pun orang yang berdiri di pihakku saat segalanya runtuh. Kali ini, aku terlahir di keluarga yang hancur. Ayahku adalah pendekar terkuat kekaisaran yang terbuang karena penyakit tak tersembuhkan. Seorang pria yang bahkan tidak pernah mencariku. Namun justru itu satu-satunya jalan yang tersisa. Jika aku menyembuhkannya, aku akan mendapatkan perlindungan. Jika aku menyelamatkannya, aku akan punya masa depan. Ini bukan permohonan. Ini kontrak. Aku akan menyembuhkan ayahku. Sebagai gantinya, dia akan menjadi pelindungku. Di kehidupan ketigaku ini, akankah aku akhirnya bisa kembali ke dunia yang seharusnya? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 56 chapters |  |  |  |
| chapter dates | PASS | 56 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 42 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://narasininja.net/.../chapter-1` to `https://narasininja.net/.../chapter-1` (1 redirects) |  |  |  |
| page load | PASS | `https://yuucdn.com/.../1-6953a107b2c76.webp` (image/webp (encoding: lossy), 196082 bytes, 850x3467) |  |  |  |
