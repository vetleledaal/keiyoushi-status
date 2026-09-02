# Extension Validation Report

- Extension: tachiyomi-vi.truyenhentaivn-v1.6.6
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2450247754585878955
- Source name: TruyenHentaivn
- Source language: vi
- Selected manga input: popular offset 0: Oppai Daisuki Dekaotoko-kun wa Hitozuma ga Suki (`.../36381-doc-truyen-oppai-daisuki-dekaotoko-kun-wa-hitozuma-ga-suki.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Oppai Daisuki Dekaotoko-kun wa Hitozuma ga Suki (`.../36381-doc-truyen-oppai-daisuki-dekaotoko-kun-wa-hitozuma-ga-suki.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | Daga Okashi (Dagashi Kashi) (`.../36353-doc-truyen-daga-okashi-dagashi-kashi.html`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Oppai Daisuki Dekaotoko-kun wa Hitozuma ga Suki (`.../36381-doc-truyen-oppai-daisuki-dekaotoko-kun-wa-hitozuma-ga-suki.html`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Un, Deux, Tro-man (`.../36351-doc-truyen-un-deux-tro-man.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Oppai Daisuki Dekaotoko-kun wa Hitozuma ga Suki (`.../36381-doc-truyen-oppai-daisuki-dekaotoko-kun-wa-hitozuma-ga-suki.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Oppai Daisuki Dekaotoko-kun wa Hitozuma ga Suki (`.../36381-doc-truyen-oppai-daisuki-dekaotoko-kun-wa-hitozuma-ga-suki.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Oneshot (`.../36381-69269-xem-truyen-oppai-daisuki-dekaotoko-kun-wa-hitozuma-ga-suki-oneshot.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 50 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Oppai Daisuki Dekaotoko-kun wa Hitozuma ga Suki, URL=`.../36381-doc-truyen-oppai-daisuki-dekaotoko-kun-wa-hitozuma-ga-suki.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://upload.truyenhentaivn.store/.../iwz9de9d.jpg` (image/jpeg, 1135912 bytes, 1280x1770) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../36381-doc-truyen-oppai-daisuki-dekaotoko-kun-wa-hitozuma-ga-suki.html` |  |  |  |
| details thumbnail URL | PASS | `https://upload.truyenhentaivn.store/.../iwz9de9d.jpg` |  |  |  |
| details author | PASS | chiro |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Transformation, Netori, BBW, Big Ass, Sweating, Milf, Big Penis, Shota, Cheating, BlowJobs, Ahegao |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 50 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://s1.truyenhentaivn.store/.../0.png <redacted query values: expires and token>` (image/png, 2434048 bytes, 3000x1684) |  |  |  |
