# Extension Validation Report

- Extension: tachiyomi-all.yaoime-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 3681435886557602253
- Source name: Yaoi.me
- Source language: en
- Selected manga input: popular offset 0: Sasakure Memorial (`.../203505`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 60 | Sasakure Memorial (`.../203505`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 60 | [Haruaki] Lewdness of public servants additional report (`.../188559`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 60 | Rockstar Never Die (`.../203914`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 60 | The Case of Doctor Agato (`.../5134`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | Sasakure Memorial (`.../203505`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sasakure Memorial (`.../203505`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 48 | Vol.1 Ch.1 (`.../4543148`) |  | <1s |
| pages | `getPageList(chapter)` | success | 48 |  |  | <1s |

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
| popular listing | PASS | 60 entries |  |  |  |
| latest listing | PASS | 60 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sasakure Memorial, URL=`203505` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 243/243 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | UNUSUAL | 242/243 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://yaoi.me/.../akT6edssiOVZSuuQ0223gSngNkGwFMv2R-pBFFtH18hDqjFX2Ry_dyG-PRYcR7pvydpVWwSVe6EC0UgH-KxK6l5WihVjaS_cWg8O9vyvH7v-f1yGAAmvapA6yxfGy8J26cVQia6cE9A6aBztg9XDEftj4zrFmYktiHFcniGXuaJKsnROcMQwHIejdpdK98cGTcMOx7_1PioAsg` (image/webp (encoding: lossy), 10662 bytes, 173x250) |  |  |  |
| details identity | PASS | Details preserved selected URL `203505` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://yaoi.me/.../qV4msexfRh6dT6rfOvUIJ_Qcz6RKFILkt65eWnwZwnhbA3vHv8N3vv_aDiiveMTtMpm8sC52nCOBrRDV2E9qHmzce24w-F_efhMDvVV3QftJlmPV0OMAnwzgD0MlcRe95-8gurqWOwEjsXM7elqftg0MmgpL2XmkYdByS2yXIZn6sL3nT3Rjd3zF3crL1xrdGDh51HWwTC0RJg` (image/webp (encoding: lossy), 42004 bytes, 460x665) |  |  |  |
| details author | PASS | Shiuko Kano |  |  |  |
| details artist | PASS | Shiuko Kano |  |  |  |
| details genres | PASS | Romance, Drama, Slice of Life, Older Seme Younger Uke, Older Uke Younger Seme, Changed by Love, Adult Couples, Younger Lover, Love Triangles, Love Confessions, Unrequited Love, Kisses, Cheating Boyfriend, First Love, Age Gap, Cheating/Infidelity, Sexual Assault, Fetishes, Frottage, Fellatio, 69, Anal Sex, Anal Fingering, Caught in the Act, Perverts, Handsome Male Lead, Appearance Different From Personality, Promiscuous Characters, Gay Protagonist, Adult Protagonist, Suits, Trains, Judo, Police, Office Workers, Detectives, Train Conductors, Salesman, Host/Hostess, Troubled Past, Flashback/s, Inferiority Complex, Collection of Stories |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 1-2. Sasakure Memorial<br>Working man Yajima Shigeru always finds himself falling for straight guys and has repeated one-night stand to flee from his failing love. This time, his heartbreaking decision led him to kiss his current love who happens to be a married junior from his work place! The train conductor happened to see the drunken Yajima planting a kiss on his junior. After being denied by his junior, he's picked up by the conductor, Mita Yuusuke, who claims that that he fell in love at first sight?!<br><br>3-4. Love Deka (ラブ・デカ)<br>5. Mayou Otoko: Xmas Limited Edition (迷う男 Xmas Limited Edition)<br><br>Alternative titles:<br>- ササクレ・メモリアル<br>- Barbed Memories<br>- Love Deka<br>- Mayou Otoko<br>- Sasakure Memoriaru<br>- Колючие воспоминания<br><br>Links:<br>- \[MangaBaka entry\](https://mangabaka.org/.../Barbed-Memories) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 48 chapters |  |  |  |
| chapter dates | PASS | 48 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 48 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://yaoi.me/.../xyUZNNjJx6wWJ_-wwc0mmC8EZ-82Ba18b0aVS1Ic5o9GPIhbBZad1Wlr8ddSiF1Zl3sYhvXVZcu5LL-9RSFnLBjp <redacted query values: w>` (image/webp (encoding: lossy), 65414 bytes, 800x511) |  |  |  |
