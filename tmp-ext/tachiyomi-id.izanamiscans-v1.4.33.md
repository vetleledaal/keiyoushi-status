# Extension Validation Report

- Extension: tachiyomi-id.izanamiscans-v1.4.33
- Input artifact: JAR
- Generated at: 2026-09-02T15:00:00Z
- Commit: 81336186c4ddb47e2a35eeb9ae58ceb10e8dc995
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 831567442922111170
- Source name: Izanami Scans
- Source language: id
- Selected manga input: latest offset 0: The Secret That Made You Cry (`.../the-secret-that-made-you-cry`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | It All Starts With Trillions Of Nether Currency (`.../it-all-starts-with-trillions-of-nether-currency`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Revenge of the Iron-Blooded Sword Hound (`.../revenge-of-the-iron-blooded-sword-hound`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | The Secret That Made You Cry (`.../the-secret-that-made-you-cry`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | How to Use an Angel (`.../how-to-use-an-angel`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | The Secret That Made You Cry (`.../the-secret-that-made-you-cry`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | The Secret That Made You Cry (`.../the-secret-that-made-you-cry`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 4 | Chapter 01 (`.../the-secret-that-made-you-cry-chapter-01`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 94 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Secret That Made You Cry, URL=`.../the-secret-that-made-you-cry` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.wp.com/.../EEUDs4ptN91h.webp <redacted query values: resize>` (image/jpeg, 113575 bytes, 512x768) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-secret-that-made-you-cry` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i2.wp.com/.../EEUDs4ptN91h.webp` (image/jpeg, 113619 bytes, 512x768) |  |  |  |
| details author | PASS | Yeonsu |  |  |  |
| details artist | PASS | Yeonsu |  |  |  |
| details genres | PASS | Drama, Romance, School life, Shoujo, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Menjelang festival sekolah, Han So-eun mendapat tugas mempersiapkan pameran foto. Setelah bertemu secara tak sengaja dengan seorang pemuda bernama Yoon Ji-hoo dan mulai memotret bersamanya, kehidupan sehari-hari yang awalnya biasa perlahan menjadi istimewa. Namun, ada sebuah rahasia yang tersembunyi. Di usia delapan belas tahun yang paling gemilang, inilah kisah tentang cinta pertama dan perjalanan kita menuju kedewasaan.<br><br>Alternative Names: The Secret Behind Your Tears, 너를 울린 비밀 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | PASS | 4 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 94 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../001.webp` (image/jpeg, 61032 bytes, 720x1600) |  |  |  |
