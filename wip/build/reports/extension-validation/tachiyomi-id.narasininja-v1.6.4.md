# Extension Validation Report

- Extension: tachiyomi-id.narasininja-v1.6.4
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 0
- Warnings: 2
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4748581925941451102
- Source name: NarasiNinja
- Source language: id
- Selected manga input: popular offset 0: The Doctor Is Out (`.../the-doctor-is-out`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | The Doctor Is Out (`.../the-doctor-is-out`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | The Hated Black Mage Returns (`.../the-hated-black-mage-returns`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Doctor Is Out (`.../the-doctor-is-out`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Doctor Is Out (`.../the-doctor-is-out`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 115 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 161 |  |  | 10s+ |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Doctor Is Out, URL=`.../the-doctor-is-out` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://narasininja.net/.../the-doctor-is-out.jpg` (image/jpeg, 22338 bytes, 160x228) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-doctor-is-out` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://narasininja.net/.../the-doctor-is-out.jpg` (image/jpeg, 22338 bytes, 160x228) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Fantasy, Romance, Shoujo |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Ketika sang Duke yang dalam kondisi memprihatinkan tiba-tiba meninggal dunia, tanah tersebut jatuh ke tangan para pemberontak. Dalam waktu singkat, pemberontakan dapat dipadamkan oleh keluarga kerajaan, tapi… Intinya adalah saya, Lise Estelle, akan digantung karena pengkhianatan. "Tidak adil!" Saya hanyalah dokter terbaik di daerah ini. Jika itu masalahnya, saya akan menjadi dokter sang duke sehingga tidak ada pemberontakan, dan saya akan membuat pewaris sang duke sehat! "Tidak ada yang peduli padamu seperti aku. Karena itu, Anda pasti harus mendengarkan saya. "Lari! Anda perlu memperkuat kekebalan Anda! "Makanlah rumput ini. Jangan katakan apa-apa lagi dan makan saja." Um… Tapi kenapa dia begitu tinggi? Apakah dia memiliki fisik yang bagus sejak awal? Yah, pokoknya, aku senang dia dibesarkan dengan baik, jadi aku bisa mengundurkan diri sekarang… "Pengunduran diri?" Matanya menyipit dan sekitarnya mulai mengeluarkan udara dingin. "Lise, kamu bilang kamu satu-satunya yang peduli padaku." Sebelum aku menyadarinya, dia berjalan mendekat dan duduk di depanku. Berbisik di telingaku seolah sengaja merayuku. "Biarkan aku pergi? Aku tidak bodoh, Lise." Tidak seperti kehidupan saya sebelumnya, dia sekarang sehat dan bahkan kepribadiannya telah berubah. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 115 chapters |  |  |  |
| chapter dates | PASS | 115 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 161 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://narasininja.net/.../chapter-1` to `https://narasininja.net/.../chapter-1` (1 redirects) |  |  |  |
| page load | FAIL | First page URL `https://v2.yuucdn.net/.../yyg5YVUeMPMiNpBexWmA9J1kqY5WBD.webp` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 522 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
