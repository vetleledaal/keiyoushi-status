# Extension Validation Report

- Extension: tachiyomi-id.astralscans-v1.4.39
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 26
- Lint: 0
- Warnings: 0
- Skipped: 9
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 829250309114015686
- Source name: Astral Scans
- Source language: id
- Selected manga input: latest offset 0: If You Touch It, You Can See It (`.../if-you-touch-it-you-can-see-it`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | While You Were Letting Your Guard Down (`.../while-you-were-letting-your-guard-down`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 5 | One Hundred Nights (`.../one-hundred-nights`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | If You Touch It, You Can See It (`.../if-you-touch-it-you-can-see-it`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 5 | Pinocchio in the Closet (`.../pinocchio-in-the-closet`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | If You Touch It, You Can See It (`.../if-you-touch-it-you-can-see-it`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | If You Touch It, You Can See It (`.../if-you-touch-it-you-can-see-it`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 0 |  |  | 1-10s |
| pages | `fetchPageList(chapter)` | skipped | 0 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | SKIP | No usable chapter was available |  |  |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=If You Touch It, You Can See It, URL=`.../if-you-touch-it-you-can-see-it` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 71/71 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 71/71 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i0.wp.com/.../poster-touch-alt.webp` (image/jpeg, 484419 bytes, 1676x2235) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../if-you-touch-it-you-can-see-it` |  |  |  |
| details thumbnail URL | PASS | `https://i0.wp.com/.../poster-touch-alt.webp` |  |  |  |
| details author | PASS | Nini (니니) |  |  |  |
| details artist | PASS | Bunji |  |  |  |
| details genres | PASS | Office worker, Yaoi, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Jung In-woo** memiliki sebuah kemampuan unik: saat dia menyentuh seseorang, dia bisa melihat fantasi seks orang tersebut. Suatu hari, dia masuk ke tempat kerja baru dan bertemu dengan ketua timnya, Yoo Ha-jin. Ha-jin sangat populer berkat parasnya yang luar biasa menawan. Namun, dedikasinya yang gila kerja dan sifatnya yang ketus membuatnya terkesan dingin serta sulit didekati. Dia nyaris tidak pernah berbicara dengan siapa pun jika bukan menyangkut urusan pekerjaan. In-woo pun tidak memiliki pandangan yang baik tentang Ha-jin, mengingat pria itu selalu menatapnya seolah dia adalah seekor hama. Namun, di tengah-tengah acara makan malam perusahaan, tubuh mereka tidak sengaja bersentuhan, dan In-woo tanpa sadar melihat sekilas hasrat tersembunyi Ha-jin. Betapa terkejutnya In-woo saat mengetahui bahwa Ha-jin memiliki fetish degradasi yang kuat—dan ternyata pria itu adalah seorang gay. Dibuat tak menyangka oleh sisi lain Ha-jin yang berbanding terbalik dengan penampilan luarnya yang tajam dan dingin, In-woo kini mendapati dirinya mulai memikirkan pria itu terus-menerus…<br><br>Alternative Names: 만지면 보이는 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | FAIL | 0 chapters | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| chapter dates | SKIP | No chapters to check |  |  |  |
| chapter titles | SKIP | No chapters to check |  |  |  |
| chapter URLs | SKIP | No chapters to check |  |  |  |
| duplicate chapter URLs | SKIP | No chapters to check |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | No usable chapter was available |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
