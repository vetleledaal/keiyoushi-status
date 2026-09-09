# Extension Validation Report

- Extension: tachiyomi-ja.mangameets-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2561264003659474410
- Source name: MangaMeets
- Source language: ja
- Selected manga input: popular offset 0: 幼馴染には戻れない (`.../3ae22c29-7a77-4dfb-8812-91f60ac2b11f`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | 幼馴染には戻れない (`.../3ae22c29-7a77-4dfb-8812-91f60ac2b11f`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | 視線 (`.../6cb1b355-c0ae-4199-8585-97f5ea0a1c28`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 19 | 王都セレブレットに勇者はいない (`.../a3dcade1-e59b-429c-852e-9bb0f529a400`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 18 | モッさんと俺。 (`.../d251e43a-0966-4d9d-852c-03af3662cbd6`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 20 | 幼馴染には戻れない (`.../3ae22c29-7a77-4dfb-8812-91f60ac2b11f`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 幼馴染には戻れない (`.../3ae22c29-7a77-4dfb-8812-91f60ac2b11f`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter 読み切り (`.../1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 32 |  |  | 1-10s |

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
| latest listing | PASS | 19 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=幼馴染には戻れない, URL=`3ae22c29-7a77-4dfb-8812-91f60ac2b11f` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://res.cloudinary.com/.../npjt91r5fy9djdc5xrqd.png` (image/png, 979171 bytes, 5489x3294) |  |  |  |
| details identity | PASS | Details preserved selected URL `3ae22c29-7a77-4dfb-8812-91f60ac2b11f` |  |  |  |
| details thumbnail URL | PASS | `http://res.cloudinary.com/.../npjt91r5fy9djdc5xrqd.png` |  |  |  |
| details author | PASS | 野田みい |  |  |  |
| details artist | PASS | 野田みい |  |  |  |
| details genres | PASS | 恋愛 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ―中学3年生、春ー<br>小学校からの幼馴染である千秋と蒼汰は、周りから見てもわかるほどの仲良しだが…。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://res.cloudinary.com/.../in2flkdqhpt5lloy9ppp.png` (image/png, 1559942 bytes, 6071x8598) |  |  |  |
