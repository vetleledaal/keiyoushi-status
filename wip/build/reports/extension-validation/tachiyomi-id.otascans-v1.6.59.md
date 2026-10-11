# Extension Validation Report

- Extension: tachiyomi-id.otascans-v1.6.59
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 3
- Failed: 2
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 2170345400165397182
- Source name: Ota Scans
- Source language: id
- Selected manga input: popular offset 0: The Yandere Sister Just Wants Me to Bully Her (`.../the-yandere-sister-just-wants-me-to-bully-her`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | The Yandere Sister Just Wants Me to Bully Her (`.../the-yandere-sister-just-wants-me-to-bully-her`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | Kimi to Tsuzuru Utakata (`.../kimi-to-tsuzuru-utakata`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Love Bullet (inee) (`.../love-bullet-inee`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Hino-san no Baka (`.../hino-san-no-baka`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Yandere Sister Just Wants Me to Bully Her (`.../the-yandere-sister-just-wants-me-to-bully-her`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Yandere Sister Just Wants Me to Bully Her (`.../the-yandere-sister-just-wants-me-to-bully-her`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 30 | Chapter 95 (`.../chapters`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 0 |  |  | <1s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Yandere Sister Just Wants Me to Bully Her, URL=`the-yandere-sister-just-wants-me-to-bully-her` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://yurilab.top/.../The-Yandere-Sister-Vol-2-350x476.jpeg` (image/jpeg, 43058 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `the-yandere-sister-just-wants-me-to-bully-her` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://yurilab.top/.../The-Yandere-Sister-Vol-2.jpeg` (image/jpeg, 274995 bytes, 1200x1816) |  |  |  |
| details author | PASS | 如梦画社 |  |  |  |
| details artist | PASS | 如梦画社 |  |  |  |
| details genres | PASS | Drama, Ecchi, Fantasy, Girls Love, Incest, Reincarnation, Romance, School Life, Short Hair, Yuri, Manhua, Project |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Tokoh utama, yang merupakan seorang novelis, sangat membenci wanita yang tampak polos dan murni tetapi manipulatif, jadi dia sengaja menciptakan karakter utama seperti itu dalam bukunya dan mengatur agar dia diperlakukan dengan buruk berulang kali! Namun, dia tidak pernah membayangkan bahwa suatu hari dia akan berakhir di dalam buku, dan sekarang dia bertekad untuk membalas dendam pribadi!<br><br>Namun karena kecenderungannya untuk jatuh cinta pada kecantikan, dia tidak dapat menyakiti protagonis yang cantik dan polos itu dan, selangkah demi selangkah, akhirnya menjadi pelindungnya… Sementara dia cemas tentang perasaannya yang salah arah, protagonis yang selalu rapuh itu mendorong protagonis pria sejauh tiga meter dan menyatakan cintanya kepada Gu Xing dengan cara yang keras kepala! Apa! Jadi, bagaimanapun juga, akulah yang dilindungi!<br><br>Alternative Names: Bìng Jiāo Mèimei Zhǐ Xiǎng Ràng Wǒ Qīfù Tā, Mi hermanita solo quiere que la intimide, The Yandere Sister Just Wants Me to Bully Her, 病娇妹妹只想让我欺负她 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 30 chapters |  |  |  |
| chapter dates | PASS | 30 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `chapters` at offsets 0, 1, 3, 4, 5, 6, 9, 10, 12, 13, 18, 21, 22, 23, 24, 25, 26, 28, 29 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
