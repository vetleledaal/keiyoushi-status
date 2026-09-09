# Extension Validation Report

- Extension: tachiyomi-es.anzmanga-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 33
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7374498796507972405
- Source name: AnzManga
- Source language: es
- Selected manga input: popular offset 0: One Punch-Man (`.../one-punchman`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | One Punch-Man (`.../one-punchman`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Tsuki ga Michibiku Isekai Douchuu (`.../tsuki-ga-michibiku-isekai-douchuu`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 38 | Witch Watch (`.../5j4y5u-witch-watch`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 35 | Sakamoto Days (`.../sakamoto-days`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | One Punch-Man (`.../one-punchman`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | One Punch-Man (`.../one-punchman`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 326 | One Punch-Man 1 :  (`.../1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 18 |  |  | 1-10s |

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
| latest listing | PASS | 38 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=One Punch-Man, URL=`.../one-punchman` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Witch Watch, URL=`.../5j4y5u-witch-watch` at page 1 offsets 0, 5, 13, 22, 27, 36 and page 2 offsets 5, 14, 20, 32, title=Kagurabachi, URL=`.../1cfg7v-kagurabachi` at page 1 offsets 1, 6, 15, 23, 29, 37 and page 2 offset 30, title=One Piece, URL=`.../one-piece` at page 1 offsets 2, 16, 24 and page 2 offsets 1, 15, 23, 27, title=Mokushiroku no Yonkishi, URL=`.../mokushiroku-no-yonkishi` at page 1 offsets 3, 9, 11, 26, 32, 34 and page 2 offsets 10, 11, 17, 28, title=Blue Lock, URL=`.../blue-lock` at page 1 offsets 4, 12, 25, 35 and page 2 offsets 12, 16, title=Sakamoto Days, URL=`.../sakamoto-days` at page 1 offsets 7, 14, 21 and page 2 offsets 0, 7, 13, 21, 26, 31, title=SPY X FAMILY, URL=`.../spy-x-family` at page 1 offsets 8, 18, 28 and page 2 offsets 6, 19, title=Dandadan, URL=`.../dandadan` at page 1 offsets 10, 17, 20, 33 and page 2 offsets 4, 18, 25, 29, title=One Punch-Man, URL=`.../one-punchman` at page 1 offsets 19, 30 and page 2 offsets 9, 24, 34, title=Mairimashita! Iruma-kun, URL=`.../mairimashita-irumakun` at page 1 offset 31 and page 2 offsets 2, 8, 22, 33 |  |  |  |
| listing duplicates | FAIL | Latest page 1 repeats 28 manga entries; Latest page 2 repeats 24 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 114/114 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 114/114 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.anzmanga25.com/.../cover_250x350.jpg` (image/jpeg, 24349 bytes, 250x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../one-punchman` |  |  |  |
| details thumbnail URL | PASS | `https://www.anzmanga25.com/.../cover_250x350.jpg` |  |  |  |
| details author | PASS | One |  |  |  |
| details artist | PASS | Yusuke Murata |  |  |  |
| details genres | PASS | Seinen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | La serie está protagonizada por un héroe que ha entrenado tanto que se ha quedado calvo, y tiene tanta fuerza que puede acabar con cualquier enemigo de un solo puñetazo. Sin embargo, al ser tan fuerte, se aburre y se frustra porque no le cuesta nada vencer sus batallas. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 1 name, chapter 2 name, chapter 3 name, chapter 4 name, chapter 5 name, chapter 6 name, chapter 7 name, chapter 8 name, chapter 9 name, chapter 10 name, chapter 11 name, chapter 12 name, chapter 13 name, chapter 14 name, chapter 15 name, chapter 16 name, chapter 17 name, chapter 18 name, chapter 19 name, chapter 20 name, chapter 21 name, chapter 22 name, chapter 23 name, chapter 24 name, chapter 25 name, chapter 26 name, chapter 27 name, chapter 28 name, chapter 29 name, chapter 30 name, chapter 31 name, chapter 32 name, chapter 33 name, chapter 34 name, chapter 35 name, chapter 36 name, chapter 37 name, chapter 38 name, chapter 39 name, chapter 40 name, chapter 41 name, chapter 42 name, chapter 43 name, chapter 44 name, chapter 45 name, chapter 46 name, chapter 47 name, chapter 48 name, chapter 49 name, chapter 50 name, chapter 51 name, chapter 52 name, chapter 53 name, chapter 54 name, chapter 55 name, chapter 56 name, chapter 57 name, chapter 58 name, chapter 59 name, chapter 60 name, chapter 61 name, chapter 62 name, chapter 63 name, chapter 64 name, chapter 65 name, chapter 66 name, chapter 67 name, chapter 68 name, chapter 69 name, chapter 70 name, chapter 71 name, chapter 72 name, chapter 73 name, chapter 74 name, chapter 75 name, chapter 76 name, chapter 77 name, chapter 78 name, chapter 79 name, chapter 80 name, chapter 81 name, chapter 82 name, chapter 83 name, chapter 84 name, chapter 85 name, chapter 86 name, chapter 87 name, chapter 88 name, chapter 89 name, chapter 90 name, chapter 91 name, chapter 92 name, chapter 93 name, chapter 94 name, chapter 95 name, chapter 96 name, chapter 97 name, chapter 98 name, chapter 99 name, chapter 100 name, chapter 101 name, chapter 102 name, chapter 103 name, chapter 104 name, chapter 105 name, chapter 106 name, chapter 107 name, chapter 108 name, chapter 109 name, chapter 110 name, chapter 111 name, chapter 112 name, chapter 113 name, chapter 114 name, chapter 115 name, chapter 116 name, chapter 117 name, chapter 118 name, chapter 119 name, chapter 120 name, chapter 121 name, chapter 122 name, chapter 123 name, chapter 124 name, chapter 125 name, chapter 126 name, chapter 127 name, chapter 128 name, chapter 129 name, chapter 130 name, chapter 131 name, chapter 132 name, chapter 133 name, chapter 134 name, chapter 135 name, chapter 136 name, chapter 137 name, chapter 138 name, chapter 139 name, chapter 140 name, chapter 141 name, chapter 142 name, chapter 143 name, chapter 144 name, chapter 145 name, chapter 146 name, chapter 147 name, chapter 148 name, chapter 149 name, chapter 150 name, chapter 151 name, chapter 152 name, chapter 153 name, chapter 154 name, chapter 155 name, chapter 156 name, chapter 157 name, chapter 158 name, chapter 159 name, chapter 160 name, chapter 161 name, chapter 162 name, chapter 163 name, chapter 164 name, chapter 165 name, chapter 166 name, chapter 167 name, chapter 168 name, chapter 169 name, chapter 170 name, chapter 171 name, chapter 172 name, chapter 173 name, chapter 174 name, chapter 175 name, chapter 176 name, chapter 177 name, chapter 178 name, chapter 179 name, chapter 180 name, chapter 181 name, chapter 182 name, chapter 183 name, chapter 184 name, chapter 185 name, chapter 186 name, chapter 187 name, chapter 188 name, chapter 189 name, chapter 190 name, chapter 191 name, chapter 192 name, chapter 193 name, chapter 194 name, chapter 195 name, chapter 196 name, chapter 197 name, chapter 198 name, chapter 199 name, chapter 200 name, chapter 201 name, chapter 202 name, chapter 203 name, chapter 204 name, chapter 205 name, chapter 206 name, chapter 207 name, chapter 208 name, chapter 209 name, chapter 210 name, chapter 211 name, chapter 212 name, chapter 213 name, chapter 214 name, chapter 215 name, chapter 216 name, chapter 217 name, chapter 218 name, chapter 219 name, chapter 220 name, chapter 221 name, chapter 222 name, chapter 223 name, chapter 224 name, chapter 225 name, chapter 226 name, chapter 227 name, chapter 228 name, chapter 229 name, chapter 230 name, chapter 231 name, chapter 232 name, chapter 233 name, chapter 234 name, chapter 235 name, chapter 236 name, chapter 237 name, chapter 238 name, chapter 239 name, chapter 240 name, chapter 241 name, chapter 242 name, chapter 243 name, chapter 244 name, chapter 245 name, chapter 246 name, chapter 247 name, chapter 248 name, chapter 249 name, chapter 250 name, chapter 251 name, chapter 252 name, chapter 253 name, chapter 254 name, chapter 255 name, chapter 256 name, chapter 257 name, chapter 258 name, chapter 259 name, chapter 260 name, chapter 261 name, chapter 262 name, chapter 263 name, chapter 264 name, chapter 265 name, chapter 266 name, chapter 267 name, chapter 268 name, chapter 269 name, chapter 270 name, chapter 271 name, chapter 272 name, chapter 273 name, chapter 274 name, chapter 275 name, chapter 276 name, chapter 277 name, chapter 278 name, chapter 279 name, chapter 280 name, chapter 281 name, chapter 282 name, chapter 283 name, chapter 284 name, chapter 285 name, chapter 286 name, chapter 287 name, chapter 288 name, chapter 289 name, chapter 290 name, chapter 291 name, chapter 292 name, chapter 293 name, chapter 294 name, chapter 295 name, chapter 296 name, chapter 297 name, chapter 298 name, chapter 299 name, chapter 300 name, chapter 301 name, chapter 302 name, chapter 303 name, chapter 304 name, chapter 305 name, chapter 306 name, chapter 307 name, chapter 308 name, chapter 309 name, chapter 310 name, chapter 311 name, chapter 312 name, chapter 313 name, chapter 314 name, chapter 315 name, chapter 316 name, chapter 317 name, chapter 318 name, chapter 319 name, chapter 320 name, chapter 321 name, chapter 322 name, chapter 323 name, chapter 324 name, chapter 325 name, chapter 326 name |  |  |  |
| chapters | PASS | 326 chapters |  |  |  |
| chapter dates | PASS | 326 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 18 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | pages: `https://drive.google.com/.../uc <redacted query values: id>` to `https://drive.usercontent.google.com/.../download <redacted query values: id>` (1 redirects) |  |  |  |
| page load | PASS | `https://drive.google.com/.../uc <redacted query values: id>` (image/jpeg, 314758 bytes, 860x1236) |  |  |  |
