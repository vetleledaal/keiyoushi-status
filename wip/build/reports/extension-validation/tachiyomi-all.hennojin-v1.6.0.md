# Extension Validation Report

- Extension: tachiyomi-all.hennojin-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 31
- Lint: 0
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 2486465102799235219
- Source name: Hennojin
- Source language: en
- Selected manga input: popular offset 0: (CiNDERELLA ☆ STAGE 7 STEP) [Threshold (Exeter)] Romantic Saimin Now (THE IDOLM@STER CINDERELLA GIRLS) [English] (`.../cinderella-%E2%98%86-stage-7-step-threshold-exeter-romantic-saimin-now-the-idolmster-cinderella-girls-english`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | (CiNDERELLA ☆ STAGE 7 STEP) [Threshold (Exeter)] Romantic Saimin Now (THE IDOLM@STER CINDERELLA GIRLS) [English] (`.../cinderella-%E2%98%86-stage-7-step-threshold-exeter-romantic-saimin-now-the-idolmster-cinderella-girls-english`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 40 | [Junk Food (Teritama Potekora)] Hissatsu Onee-san 2 [English] [Digital] (`.../junk-food-teritama-potekora-hissatsu-onee-san-2-english-digital`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | (CiNDERELLA ☆ STAGE 7 STEP) [Threshold (Exeter)] Romantic Saimin Now (THE IDOLM@STER CINDERELLA GIRLS) [English] (`.../cinderella-%E2%98%86-stage-7-step-threshold-exeter-romantic-saimin-now-the-idolmster-cinderella-girls-english`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | (CiNDERELLA ☆ STAGE 7 STEP) [Threshold (Exeter)] Romantic Saimin Now (THE IDOLM@STER CINDERELLA GIRLS) [English] (`.../cinderella-%E2%98%86-stage-7-step-threshold-exeter-romantic-saimin-now-the-idolmster-cinderella-girls-english`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../manga-reader <redacted query values: manga and view>`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 23 |  |  | <1s |

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
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=(CiNDERELLA ☆ STAGE 7 STEP) \[Threshold (Exeter)\] Romantic Saimin Now (THE IDOLM@STER CINDERELLA GIRLS) \[English\], URL=`<redacted home path> |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hennojin.com/.../001-Romantic-Saimin-Now-ENG-Cover.jpg` (image/jpeg, 107240 bytes, 500x730) |  |  |  |
| details identity | PASS | Details preserved selected URL `<redacted home path> |  |  |  |
| details thumbnail URL | PASS | `https://hennojin.com/.../001-Romantic-Saimin-Now-ENG-Cover.jpg` |  |  |  |
| details author | PASS | Threshold |  |  |  |
| details artist | PASS | Exeter |  |  |  |
| details genres | PASS | THE IDOLM@STER CINDERELLA GIRLS, Miria Akagi, Ahegao, Blowjob, Lolicon, Mind Control, Sole Female, Twintails, Unusual Pupils |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Commissioner: Solraius <br>Translator: NekoHime <br>Editor: VanDerGraf <br>Proofreader: Eclipsoul |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://hennojin.com/.../1` to `https://hennojin.com/.../home` (1 redirects); popular: `https://hennojin.com/.../home` to `https://hennojin.com/.../home` (1 redirects); popular: `https://hennojin.com/.../2` to `https://hennojin.com/.../2` (1 redirects); popular: `https://hennojin.com/.../1 <redacted query values: keyword and _wpnonce>` to `https://hennojin.com/.../home <redacted query values: keyword and _wpnonce>` (1 redirects) |  |  |  |
| page load | PASS | `https://hennojin.com/.../1.jpg` (image/jpeg, 1520197 bytes, 1244x1817) |  |  |  |
