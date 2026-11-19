# Extension Validation Report

- Extension: tachiyomi-en.fourporncomic-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: yiimanga
- Source ID: 3992984777516935224
- Source name: 4PornComic
- Source language: en
- Selected manga input: popular offset 0: Father-In-Law At Home [CrazyDad3D] (`.../father-in-law-at-home-crazydad3d`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Father-In-Law At Home [CrazyDad3D] (`.../father-in-law-at-home-crazydad3d`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Renata [Blackadder] (`.../renata-blackadder`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | An Idol Manager's Diary (`.../an-idol-managers-diary`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Banging My Friend’s Mom (`.../banging-my-friends-mom`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Father-In-Law At Home [CrazyDad3D] (`.../father-in-law-at-home-crazydad3d`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 68 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 81 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 96/96 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 96/96 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://4porncomic.com/.../father-in-law-at-home-crazydad3d.jpg` (image/jpeg, 15799 bytes, 277x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../father-in-law-at-home-crazydad3d` |  |  |  |
| details thumbnail URL | PASS | `https://4porncomic.com/.../father-in-law-at-home-crazydad3d.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | CrazyDad3D |  |  |  |
| details genres | PASS | Inseki, Incest, Big Breasts, Old Man, Lingerie, Big Ass, Bestiality / Zoophilia, Cheating, MILF, Dog, Netorare, Dark Skin, 3D, Interracial, Garter Belt, Daughter, Stockings |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Father-In-Law At Home by CrazyDad3D is a steamy adult comic. With beautifully rendered full-color artwork and realistic details, CrazyDad3D brings to life an erotic journey of seduction, intimacy, and longing that fans of adult comics won't want to miss.<br><br>Looking for Father-In-Law At Home? Read every available chapter online for free on 4PornComic. Created by CrazyDad3D, this popular porn comic is updated regularly with high-resolution artwork and fast-loading pages.<br><br>Discover more porn comics, adult manhwa, and mature webtoons with daily updates on 4PornComic. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 68 chapters |  |  |  |
| chapter dates | PASS | 68 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 81 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img11.4porncomic.com/.../1-fbf.jpg` (image/jpeg, 695025 bytes, 3334x2500) |  |  |  |
