# Extension Validation Report

- Extension: tachiyomi-ja.kisslove-v1.6.20
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6304246026723672697
- Source name: KissLove
- Source language: ja
- Selected manga input: popular offset 0: ISEKAI KUSO YAROU NI AKUMA NO TETTSUI WO (`.../isekai-kuso-yarou-ni-akuma-no-tettsui-wo`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | ISEKAI KUSO YAROU NI AKUMA NO TETTSUI WO (`.../isekai-kuso-yarou-ni-akuma-no-tettsui-wo`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 36 | AGENT OF THE SUCCUBUS (`.../agent-of-the-succubus`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 36 | FUTOKU NO GUILD - RAW (`.../futoku-no-guild-raw`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 36 | ISEKAI KUSO YAROU NI AKUMA NO TETTSUI WO (`.../isekai-kuso-yarou-ni-akuma-no-tettsui-wo`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | ISEKAI KUSO YAROU NI AKUMA NO TETTSUI WO (`.../isekai-kuso-yarou-ni-akuma-no-tettsui-wo`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 12 | Chapter 1.0 (`.../isekai-kuso-yarou-ni-akuma-no-tettsui-wo-chapter-1.0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 32 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ISEKAI KUSO YAROU NI AKUMA NO TETTSUI WO, URL=`isekai-kuso-yarou-ni-akuma-no-tettsui-wo` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 118/118 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 118/118 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://j4.jfimv2.xyz/.../isekai-kuso-yarou-ni-akuma-no-tettsui-wo_6aca542e5d731.jpg` (image/jpeg, 235735 bytes, 320x451) |  |  |  |
| details identity | PASS | Details preserved selected URL `isekai-kuso-yarou-ni-akuma-no-tettsui-wo` |  |  |  |
| details thumbnail URL | PASS | `https://j4.jfimv2.xyz/.../isekai-kuso-yarou-ni-akuma-no-tettsui-wo_6aca542e5d731.jpg` |  |  |  |
| details author | PASS | Agape |  |  |  |
| details artist | PASS | Agape |  |  |  |
| details genres | PASS | Fantasy, Drama, Horror, Supernatural, Psychological, Ecchi, Seinen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 「あなたの復讐、私がいただきますね」 その鉄槌は正義ではなく、美食のために下される…――搾取され、ゴミのように捨てられた持たざる者達。そんな彼らの怨嗟の声に導かれ、悪魔が姿を現す。復讐の先に、舌なめずりしてしまうほどのクソ野郎がいるはずだから。彼女の主食は人間の感情。その中でも悪人の後悔は極上で、どんな金持ちも、どんな権力者も等しく彼女の獲物だ。命乞いなど聞く耳持たず、願うは心の底からの後悔のみ…！この世に蔓延る理不尽に、悪魔が下す鉄槌を見届けよ…！<br><br>異世界クソ野郎に悪魔の鉄槌を, Sinners Beware, the Wrath of the Demon's Hammer!, 이세계 X새끼에게 악마의 철퇴를, Un martillo de hierro del diablo para el maldito de otro mundo, Chiếc búa sắt của ác quỷ dành cho tên khốn ở thế giới khác, 給異世界混帳降下惡魔的鐵錘 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 12 chapters |  |  |  |
| chapter dates | PASS | 12 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://j1.jfimv2.xyz/.../374e72fae1f1c3e4745b7c5b70b1a1ad003.jpg` (image/jpeg, 295962 bytes, 864x1200) |  |  |  |
