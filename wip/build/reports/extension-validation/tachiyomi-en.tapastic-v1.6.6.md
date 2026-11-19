# Extension Validation Report

- Extension: tachiyomi-en.tapastic-v1.6.6
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5554748812413853237
- Source name: Tapas
- Source language: en
- Selected manga input: popular offset 0: I Shall Master this Family (`.../205543`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | I Shall Master this Family (`.../205543`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Villainesses Have More Fun (`.../222698`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Sweet Lime (`.../216822`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | DemON (`.../145100`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 10 | I Shall Master this Family (`.../205543`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I Shall Master this Family (`.../205543`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 232 | Prologue (`.../2135770`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 45 |  |  | <1s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I Shall Master this Family, URL=`.../205543` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 110/110 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 110/110 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://story-a.tapas.io/.../6ada779e-dca5-4ebe-bc5e-8101fc737872.png` (image/png, 526535 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../205543` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://us-a.tapas.io/.../6ada779e-dca5-4ebe-bc5e-8101fc737872_z.jpg` (image/jpeg, 357323 bytes, 400x600) |  |  |  |
| details author | PASS | Kim Roah, Mon, Antstudio |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Romance Fantasy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The great Lombardi family was once at the top of the empire. After the death of its patriarch, the fate of the family and that of Firentia, born from a Lombardi and a peasant, fall to ruin at the hands of her useless and cruel cousins. But when she’s reincarnated as her seven-year-old self, she’ll work to protect the family’s honor, gain her grandpa Lulac’s favor, and prevent her own father’s death. In this lifetime, there’s only one way for her to win: become the head of their mighty household.<br><br>Type: Comic<br><br><br>ⓒ Mon, Antstudio, Kim Roah 2021 / D&C MEDIA<br><br><br><br>Published by TAPAS MEDIA 2021<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description, chapter 1 name, chapter 2 name, chapter 3 name, chapter 4 name, chapter 5 name, chapter 6 name, chapter 7 name, chapter 8 name, chapter 9 name, chapter 10 name, chapter 11 name, chapter 12 name, chapter 13 name, chapter 14 name, chapter 15 name, chapter 16 name, chapter 17 name, chapter 18 name, chapter 19 name, chapter 20 name, chapter 21 name, chapter 22 name, chapter 23 name, chapter 24 name, chapter 25 name, chapter 26 name, chapter 27 name, chapter 28 name, chapter 29 name, chapter 30 name, chapter 31 name, chapter 32 name, chapter 33 name, chapter 34 name, chapter 35 name, chapter 36 name, chapter 37 name, chapter 38 name, chapter 39 name, chapter 40 name, chapter 41 name, chapter 42 name, chapter 43 name, chapter 44 name, chapter 45 name, chapter 46 name, chapter 47 name, chapter 48 name, chapter 49 name, chapter 50 name, chapter 51 name, chapter 52 name, chapter 53 name, chapter 54 name, chapter 55 name, chapter 56 name, chapter 57 name, chapter 58 name, chapter 59 name, chapter 60 name, chapter 61 name, chapter 62 name, chapter 63 name, chapter 64 name, chapter 65 name, chapter 66 name, chapter 67 name, chapter 68 name, chapter 69 name, chapter 70 name, chapter 71 name, chapter 72 name, chapter 73 name, chapter 74 name, chapter 75 name, chapter 76 name, chapter 77 name, chapter 78 name, chapter 79 name, chapter 80 name, chapter 81 name, chapter 82 name, chapter 83 name, chapter 84 name, chapter 85 name, chapter 86 name, chapter 87 name, chapter 88 name, chapter 89 name, chapter 90 name, chapter 91 name, chapter 92 name, chapter 93 name, chapter 94 name, chapter 95 name, chapter 96 name, chapter 97 name, chapter 98 name, chapter 99 name, chapter 100 name, chapter 101 name, chapter 102 name, chapter 103 name, chapter 104 name, chapter 105 name, chapter 106 name, chapter 107 name, chapter 108 name, chapter 109 name, chapter 110 name, chapter 111 name, chapter 112 name, chapter 113 name, chapter 114 name, chapter 115 name, chapter 116 name, chapter 117 name, chapter 118 name, chapter 119 name, chapter 120 name, chapter 121 name, chapter 122 name, chapter 123 name, chapter 124 name, chapter 125 name, chapter 126 name, chapter 127 name, chapter 128 name, chapter 129 name, chapter 130 name, chapter 131 name, chapter 132 name, chapter 133 name, chapter 134 name, chapter 135 name, chapter 136 name, chapter 137 name, chapter 138 name, chapter 139 name, chapter 140 name, chapter 141 name, chapter 142 name, chapter 143 name, chapter 144 name, chapter 145 name, chapter 146 name, chapter 147 name, chapter 148 name, chapter 149 name, chapter 150 name, chapter 151 name, chapter 152 name, chapter 153 name, chapter 154 name, chapter 155 name, chapter 156 name, chapter 157 name, chapter 158 name, chapter 159 name, chapter 160 name, chapter 161 name, chapter 162 name, chapter 163 name, chapter 164 name, chapter 165 name, chapter 166 name, chapter 167 name, chapter 168 name, chapter 169 name, chapter 170 name, chapter 171 name, chapter 172 name, chapter 173 name, chapter 174 name, chapter 175 name, chapter 176 name, chapter 177 name, chapter 178 name, chapter 179 name, chapter 180 name, chapter 181 name, chapter 182 name, chapter 183 name, chapter 184 name, chapter 186 name, chapter 187 name, chapter 188 name, chapter 189 name, chapter 190 name, chapter 191 name, chapter 192 name, chapter 193 name, chapter 194 name, chapter 195 name, chapter 196 name, chapter 197 name, chapter 198 name, chapter 199 name, chapter 200 name, chapter 201 name, chapter 202 name, chapter 203 name, chapter 204 name, chapter 205 name, chapter 206 name, chapter 207 name, chapter 208 name, chapter 209 name, chapter 210 name, chapter 211 name, chapter 212 name, chapter 213 name, chapter 214 name, chapter 215 name, chapter 216 name, chapter 217 name, chapter 218 name, chapter 219 name, chapter 220 name, chapter 221 name, chapter 222 name, chapter 223 name, chapter 224 name, chapter 225 name, chapter 226 name, chapter 227 name, chapter 228 name, chapter 229 name |  |  |  |
| chapters | PASS | 232 chapters |  |  |  |
| chapter dates | PASS | 232 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 45 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://tapas.io/.../info` to `https://tapas.io/.../info` (1 redirects) |  |  |  |
| page load | PASS | `https://us-a.tapas.io/.../1e79c887-09b3-4619-86e6-bb5c476e37fc.jpg <redacted query values: __token__ and version>` (image/jpeg, 127278 bytes, 940x1372) |  |  |  |
