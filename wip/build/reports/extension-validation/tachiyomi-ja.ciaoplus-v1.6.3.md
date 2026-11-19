# Extension Validation Report

- Extension: tachiyomi-ja.ciaoplus-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1585589665574145721
- Source name: Ciao Plus
- Source language: ja
- Selected manga input: latest offset 0: この恋が、罪だとしても (`.../00224`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | 上杉くんは女の子をやめたい (`.../00577`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | 僕は人魚姫を食べたい (`.../00674`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 739 | この恋が、罪だとしても (`.../00224`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | この恋が、罪だとしても (`.../00224`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | この恋が、罪だとしても (`.../00224`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 57 | 第1話（前編） (`.../5511`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 22 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 739 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=この恋が、罪だとしても, URL=`00224` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 790/790 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 790/790 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.ciao.shogakukan.co.jp/.../banner_20231207163052970a8c5e72fafebf0fb69002da086f8c.jpg` (image/jpeg, 239039 bytes, 1340x1005) |  |  |  |
| details identity | PASS | Details preserved selected URL `00224` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.ciao.shogakukan.co.jp/.../banner_20231207163052970a8c5e72fafebf0fb69002da086f8c.jpg` |  |  |  |
| details author | PASS | 中原杏 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ラブ, 家族 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 8歳の時にちせが出会った男の子。その子の名は千隼。両親をなくした千隼は、ちせの家に引き取られることになる。そして、ちせと千隼は血のつながっていない兄妹に…。だけど次第に惹かれていく二人。 そんな二人の前に、非情なる運命が待ち受けていて…。<br><br>毎週水曜 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 57 chapters |  |  |  |
| chapter dates | PASS | 57 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.ciao.shogakukan.co.jp/.../b9d91aa740ddc63449821b91b05d6f51db8b823046804d2322b79267c762398b.jpg <redacted query values: Expires, Signature, and Key-Pair-Id>` (image/jpeg, 637484 bytes, 1303x2048) |  |  |  |
