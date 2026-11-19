# Extension Validation Report

- Extension: tachiyomi-all.xasiatalbums-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7187893778775685546
- Source name: XAsiat Albums
- Source language: all
- Selected manga input: popular offset 0: [Photobook] 木南美々写真集 あなたに抱かれたい (`.../photobook1362`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | [Photobook] 木南美々写真集 あなたに抱かれたい (`.../photobook1362`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 12 | [WPB-net]+Special No.359 本郷柚巴 「FLYING SUMMER ～ひと足お先に夏モード！～」 2026.04 (`.../wpb-net-special-no-359-flying-summer-2026-04`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | [BLUECAKE] Lee Ahrin - Eat And Sleep (`.../bluecake-lee-ahrin-eat-and-sleep`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 12 | [Photobook]【デジタル限定】長澤茉里奈写真集「OLになったまりちゅう」 (`.../photobook-ol5`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 12 | [Photobook] 木南美々写真集 あなたに抱かれたい (`.../photobook1362`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [Photobook] 木南美々写真集 あなたに抱かれたい (`.../photobook1362`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Photobook (`.../photobook1362`) |  | <1s |
| pages | `getPageList(chapter)` | success | 88 |  |  | <1s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[Photobook\] 木南美々写真集 あなたに抱かれたい, URL=`.../photobook1362` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 60/60 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 60/60 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pic.xascdn.li/.../preview.jpg` (image/jpeg, 41948 bytes, 380x507) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../photobook1362` |  |  |  |
| details thumbnail URL | PASS | `https://pic.xascdn.li/.../preview.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | JAV & AV Models, Photobook |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 88 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://www.xasiat.com/.../albums <redacted query values: mode, function, block_id, from, sort_by, and _>` to `https://www.xasiat.com/.../albums <redacted query values: mode, function, block_id, from, sort_by, and _>` (1 redirects); popular: `https://www.xasiat.com/.../albums <redacted query values: mode, function, block_id, from, sort_by, and _>` to `https://www.xasiat.com/.../albums <redacted query values: mode, function, block_id, from, sort_by, and _>` (1 redirects); popular: `https://www.xasiat.com/.../albums <redacted query values: mode, function, block_id, from, sort_by, and _>` to `https://www.xasiat.com/.../albums <redacted query values: mode, function, block_id, from, sort_by, and _>` (1 redirects); popular: `https://www.xasiat.com/.../search <redacted query values: mode, function, block_id, from, from_albums, q, and _>` to `https://www.xasiat.com/.../search <redacted query values: mode, function, block_id, from, from_albums, q, and _>` (1 redirects); popular: `https://www.xasiat.com/.../albums <redacted query values: mode, function, block_id, from, sort_by, and _>` to `https://www.xasiat.com/.../albums <redacted query values: mode, function, block_id, from, sort_by, and _>` (1 redirects) |  |  |  |
| page load | PASS | `https://www.xasiat.com/.../2686913.jpg <redacted query values: i-acctoken>` (image/jpeg, 1828620 bytes, 1357x1920) |  |  |  |
