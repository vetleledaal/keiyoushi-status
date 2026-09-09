# Extension Validation Report

- Extension: tachiyomi-pt.covenscan-v1.4.54
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 33
- Lint: 2
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madaralegacy
- Source ID: 5558728935088189480
- Source name: Coven Scan
- Source language: pt-BR
- Selected manga input: latest offset 0: Cash or Credit (`.../cash-or-credit`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 8 | Rebirth as the Villainous Duke (`.../rebirth-as-the-villainous-duke`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 8 | Como Terminar com Ele (`.../como-terminar-com-ele`) |  | 10s+ |
| latest | `fetchLatestUpdates(1)` | success | 8 | Cash or Credit (`.../cash-or-credit`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 8 | Winter Time (`.../winter-time`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Cash or Credit (`.../cash-or-credit`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Cash or Credit (`.../cash-or-credit`) |  | 10s+ |
| chapters | `fetchChapterList(manga)` | success | 77 | Capítulo 01 (`https://covendasbruxonas.com/.../capitulo-01 <redacted query values: style>`) |  | 10s+ |
| pages | `fetchPageList(chapter)` | success | 5 |  |  | 1-10s |

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
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | PASS | 8 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Cash or Credit, URL=`.../cash-or-credit` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 33/33 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 33/33 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://covendasbruxonas.com/.../tall-2-9-350x476.webp` (image/webp (encoding: lossy), 39954 bytes, 350x476) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../cash-or-credit` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://covendasbruxonas.com/.../tall-2-9.webp` (image/webp (encoding: lossy), 71874 bytes, 420x560) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | GOODMEN |  |  |  |
| details genres | PASS | Ativo, BL, Completo, Drama, Mature, Prisão, Psicológico, Romance, Sem Censura, Smut, Tóxico, Vingança, Violência, Yaoi, Dark Projects, Hospedagem |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Keith, um lendário vigarista que fez carreira fraudando máfias e sindicatos criminosos, se vê encurralado pela polícia. Para evitar ser capturado, ele se esconde no lugar mais improvável: a prisão. Mas a segurança temporária de seu confinamento auto imposto dura pouco quando ele chama a atenção do oficial da prisão, Della, o guarda mais temido da prisão. Agora, Keith precisa navegar em uma nova disputa pelo poder, na qual pode ser forçado a perder mais do que apenas sua liberdade.<br><br>“Pare de se fingir de inocente e tire isso logo.”<br><br>Nomes alternativos: cash or credit (캐시 오어 크레딧) Cash ou crédit ? キャッシュ・オア・クレジット 캐시 오어 크레딧 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 77 chapters |  |  |  |
| chapter dates | LINT | All 77 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=77 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 77 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://covendasbruxonas.com/.../00.jpg` (image/jpeg, 248879 bytes, 720x392) |  |  |  |
