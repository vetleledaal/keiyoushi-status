# Extension Validation Report

- Extension: tachiyomi-ja.welovemangaone-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: fmreader
- Source ID: 1647179844716143786
- Source name: Love4u
- Source language: ja
- Selected manga input: popular offset 0: Isekai De Tochi O Katte Noujou O Tsukurou - Raw (`.../manga-18`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Isekai De Tochi O Katte Noujou O Tsukurou - Raw (`.../manga-18`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | My Hero Academia (manga) (`.../manga-1840`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Hoshi Wo Tsugu Idol (`.../manga-8013`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Yomu Tabi Ni Shiawase Wo! (`.../manga-7094`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Isekai De Tochi O Katte Noujou O Tsukurou - Raw (`.../manga-18`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Isekai De Tochi O Katte Noujou O Tsukurou - Raw (`.../manga-18`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 84 | Chapter 1 (`.../wlmr-isekai-de-tochi-o-katte-noujou-o-tsukurou-raw-chapter-1.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 38 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Isekai De Tochi O Katte Noujou O Tsukurou - Raw, URL=`.../manga-18` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s4.ihlv1.xyz/.../5f4494c81afa9_5f4494cb3d291.jpg` (image/jpeg, 290046 bytes, 320x454) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../manga-18` |  |  |  |
| details thumbnail URL | PASS | `https://s4.ihlv1.xyz/.../5f4494c81afa9_5f4494cb3d291.jpg` |  |  |  |
| details author | PASS | Oji KURO |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adventure, Comedy, Fantasy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | In this fantasy isekai story, a salaryman sent to another world chooses a farming life over adventure–and ends up with a mermaid wife!Norio, a corporate drone in modern Japan, is summoned to a fantasy world to fight evil! But it turns out that the magical ability he got doesn’t work?! Thankfully, he has a plan B. Ask for a plot of land to cultivate a farm! To his surprise, that supposedly useless magic ability turbo charges his tools, allowing him to craft with wood like a master and plant vast fields of crops. After fishing up a mermaid wife, charming a lich, and tempting a young dragon over to his side with home cooking, there’s nothing our hero can’t do!<br><br>Alternative Name: 異世界で土地を買って農場を作ろう, Let\'s Buy the Land and Cultivate It in a Different World, 이세계에서 토지를 사서 농장을 만들자, 在异世界购买土地建造农场 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 84 chapters |  |  |  |
| chapter dates | PASS | 84 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 38 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://love4u.net/.../wlmr-isekai-de-tochi-o-katte-noujou-o-tsukurou-raw-chapter-1.html` to `https://love4u.net/.../isekai-de-tochi-o-katte-noujou-o-tsukurou-raw-chapter-1.327.html` (1 redirects) |  |  |  |
| page load | PASS | `https://ihlv1.xyz/.../36f410628644250627148a5c7f79cc7801.png` (image/png, 590579 bytes, 985x1400) |  |  |  |
